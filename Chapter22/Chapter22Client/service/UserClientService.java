package com.Allen.service;

import com.Allen.common.Message;
import com.Allen.common.MessageType;
import com.Allen.common.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-03-30
 * Time: 21:32
 */
public class UserClientService {
    //我们可能在其他地方要使用User信息，因此作出成员属性
    private User u = new User();
    //因为Socket在其它地方也可能使用，因此作出属性
    private Socket socket;

    //根据userId 和 pwd 到服务器验证该用户是否合法
    public boolean checkUser(String userId, String password) {
        boolean b = false;
        //创建User对象
        u.setUserId(userId);
        u.setPassword(password);
        //连接到服务端，发射u对象
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
            //得到oos对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            //发送User对象
            oos.writeObject(u);

            //读取从服务器回复的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message ms = (Message) ois.readObject();

            if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {
                //表示登录OK
                // 创建一个和服务器端保持通信的线程-> 创建一个类 ClientConnectServerThread
                ClientConnectServerThread clientConnectServerThread =
                        new ClientConnectServerThread(socket);
                //启动客户端的线程
                clientConnectServerThread.start();
                //这里为了后面客户端的扩展，我们将线程放入到集合管理
                ManageClientConnectServerThread.addClientConnectServerThread(userId, clientConnectServerThread);
                //做完再设置true安全
                b = true;

            } else {
                //登陆失败的话就不能启动和服务器通信的线程
                socket.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public void onlineFriendList() {
        //发送Message，类型是   MESSAGE_GET_ONLINE_FRIEND="4"
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(u.getUserId());
        //发送给服务器
        //应该得到当前线程的Socket对应的ObjectOutputSteam对象
        try {
            //这个写法不太好
//            ObjectOutputStream oos = new ObjectOutputStream
//                    (ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId()).getSocket().getOutputStream());

            //从管理线程的集合中，通过userId, 得到这个线程对象
            ClientConnectServerThread clientConnectServerThread = ManageClientConnectServerThread
                    .getClientConnectServerThread(u.getUserId());
            //通过这个线程得到关联的socket
            Socket socket = clientConnectServerThread.getSocket();
            //得到当前线程的Socket 对应的 ObjectOutputStream对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);//发送一个Message对象，向服务端要求在线用户列表
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logout() {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(u.getUserId());

        //发送信息
        try {
            //最好不要这么写，这个只有一个线程
            //ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId()).getSocket().getOutputStream());
            oos.writeObject(message);//发送信息
            System.out.println(u.getUserId()+"退出系统 ");
            //网络慢还是可能报错
            System.exit(0);//结束进程
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
