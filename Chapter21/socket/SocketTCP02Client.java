package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-03-18
 * Time: 19:20
 */
@SuppressWarnings({"all"})

public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回=" + socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, server\n".getBytes());
        socket.shutdownOutput();//结束标志

        InputStream inputStream = socket.getInputStream();
        byte[]  buf=new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));//根据读取到的实际长度，显示内容.
        }

        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出.....");
    }
}
