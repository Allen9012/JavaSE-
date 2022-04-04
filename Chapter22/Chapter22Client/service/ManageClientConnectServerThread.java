package com.Allen.service;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-04-01
 * Time: 19:17
 */
public class ManageClientConnectServerThread {
    //多个线程放入HashMap，key是用户ID，value就是线程
    private static HashMap<String,ClientConnectServerThread> hm=new HashMap<>();
    //将某个线程加入到集合
    public static void addClientConnectServerThread(String userId,ClientConnectServerThread clientConnectServerThread){
        hm.put(userId,clientConnectServerThread);
    }
    //通过一个方法userID可以得到对应的线程
    public static ClientConnectServerThread getClientConnectServerThread(String userId){
        return hm.get(userId);
    }
}
