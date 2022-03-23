package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-03-18
 * Time: 19:24
 */
@SuppressWarnings({"all"})
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接..");
        Socket socket = serverSocket.accept();
        System.out.println("服务端 socket =" + socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));//根据读取到的实际长度，显示内容.
        }

        outputStream.write("hello,client".getBytes());
        socket.shutdownOutput();//结束标志

        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();//关闭
    }
}
