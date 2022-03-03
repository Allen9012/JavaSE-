package com.File;

import org.testng.annotations.Test;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-31
 * Time: 14:29
 */
public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void info(){
        File file = new File("d:\\news.txt");
        //call relevant method,and get related information
        System.out.println("文件名字=" + file.getName());
//getName、getAbsolutePath、getParent、length、exists、isFile、isDirectory
        System.out.println("文件绝对路径=" + file.getAbsolutePath());
        System.out.println("文件父级目录=" + file.getParent());
        System.out.println("文件大小(字节)=" + file.length());
        System.out.println("文件是否存在=" + file.exists());//T
        System.out.println("是不是一个文件=" + file.isFile());//T
        System.out.println("是不是一个目录=" + file.isDirectory());//F

    }
}

