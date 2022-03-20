package com.API;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Allen
 * @version 1.0
 * 演示InetAddress 类的使用
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        //1. 获取本机的InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//LAPTOP-HHALVIA2/192.168.11.1

        //2. 根据指定主机名 获取 InetAddress对象
        InetAddress host1 = InetAddress.getByName("LAPTOP-HHALVIA2");
        System.out.println("host1=" + host1);//LAPTOP-HHALVIA2/192.168.11.1

        //3. 根据域名返回 InetAddress对象, 比如 www.baidu.com 对应
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2=" + host2);//www.baidu.com /180.101.49.12

        //4. 通过 InetAddress 对象，获取对应的地址
        String hostAddress = host2.getHostAddress();//IP 180.101.49.12
        System.out.println("host2 对应的ip = " + hostAddress);//host2 对应的ip = 180.101.49.12

        //5. 通过 InetAddress 对象，获取对应的主机名/或者的域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的主机名/域名=" + hostName); // www.baidu.com

    }
}
