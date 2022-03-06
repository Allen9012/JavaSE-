package com.File.FileInputStream;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-01
 * Time: 10:33
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /**
     * 演示读取文件...
     * 单个字节的读取，效率比较低
     * -> 使用read(byte[] b)
     */
    //实现一个fileInputstream 一个一个字节读取，hello里面的内容
    @Test
    public void readFile01() /*throws FileNotFoundException*/ {
        String filePath = "d:\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        // 为什么我要在这里面输入一个null？
        // 是因为我要扩大fileInputStream的作用域，使得finally里面才能使用close

        try {
            //创建FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据。如果没有输入可用，此方法将阻止。
            //如果返回-1 , 表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.println((char) readData);//转成char显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源.
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 使用read(byte[] b) 读取文件，提高效率
     */
    @Test
    public void readFile02() throws FileNotFoundException {
        String filePath = "d:\\hello.txt";
        int readData = 0;
        //字节数组
        byte[] buf = new byte[8];//一次八个字节
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取最多b.length 字节的数据到字节数组。此方法将阻塞，直到某些输入可用。
            //如果返回-1 , 表示读取完毕
            //如果读取正常, 返回实际读取的字节数
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, readLen));//转成char显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源.
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
