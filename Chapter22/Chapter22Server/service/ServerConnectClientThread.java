package com.Allen.service;

import com.Allen.common.Message;
import com.Allen.common.MessageType;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * Description:object from this class keep contact with server
 * User: Allen
 * Date: 2022-04-01
 * Time: 20:37
 */
public class ServerConnectClientThread extends Thread {
    private Socket socket;
    private String userId;

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    public void run() {
        //run的状态，这样可以保证一直被保持接发消息
        while (true) {
            System.out.println("服务端和客户端" + userId + " 保持通信，读取数据...");
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                //后面会使用message传递，根据message类型来做相应的处理
                if (message.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)) {
                    //客户端要在线用户列表
                     /*
                    在线用户列表形式 100  200  紫霞仙子
                     */
                    System.out.println(message.getSender()+"要在线用户列表");
                    String onlineUser = ManageClientThreads.getOnlineUser();
                    //返回message
                    //构建一个Message 对象，返回给客户端
                    Message message2 = new Message();
                    message2.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                    message2.setContent(onlineUser);
                    message2.setGetter(message.getSender());
                    //返回给客户端
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message2);



                } else {
                    System.out.println("其他类型，暂时不处理");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }


}
