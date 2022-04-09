package com.Allen.service;

import com.Allen.common.Message;
import com.Allen.common.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:该类提供和消息相关的服务方法
 * User: Allen
 * Date: 2022-04-05
 * Time: 13:01
 */
public class MessageClientService {
    /**
     * @param content  内容
     * @param senderId 发送用户id
     * @param getterId 接收用户id
     */
    public  void sendMessageToOne(String content,String senderId,String getterId){
        //构建Message
        Message message = new Message();
        message.setSender(senderId);
        message.setGetter(getterId);
        message.setContent(content);
        message.setSendTime(new Date().toString());//将message对象设置发送时间
        message.setMesType(MessageType.MESSAGE_COMM_MES);
        System.out.println(senderId+" 对 "+getterId+ " 说 "+content);
        //发送
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
                    oos.writeObject(message);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  void sendMessageToAll(String content,String senderId){
        //构建Message
        Message message = new Message();
        message.setSender(senderId);
        message.setContent(content);
        message.setSendTime(new Date().toString());//将message对象设置发送时间
        message.setMesType(MessageType.MESSAGE_TO_ALL_MES);
        System.out.println(senderId+ " 对大家说 "+content);
        //发送
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
