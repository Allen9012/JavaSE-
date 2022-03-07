package com.File.FileOutputStream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-01
 * Time: 13:04
 */
public class FileCopy {
    public static void main(String[] args) {
        //finish file copy,and bring d:\\Mai.jpg copy to e:\\
        //1. 创建文件的输入流, 将文件读入到程序
        //2. 创建文件的输出流， 将读取到的文件数据，写入到指定的文件.
        String srcFilePath="e:\\Mai.jpg";
        String destFilePath="d:\\demo";
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;


        try {
            FileInputStream fileInputStream1 = new FileInputStream(srcFilePath);
            FileOutputStream fileOutputStream1 = new FileOutputStream(destFilePath);
            //读取方式选择快一点的
            byte[] buf=new byte[20];
            int readLen=0;
            while((readLen=fileInputStream.read(buf))!=-1){
                //读取到之后就写入到文件
                //边读边写
                fileOutputStream.write(buf,0,readLen);//另一个write方法会使得文件损失

            }
            System.out.println("拷贝成功ok~");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fileInputStream!=null){
                    fileInputStream.close();
                }
                if(fileOutputStream!=null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
