package com.File;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-31
 * Time: 13:57
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    //方式1
    @Test
    public  void create01(){
        String filepath="d:\\news1.txt";
        File file = new File(filepath);
        try {
            file.createNewFile();
            System.out.println("create file successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式2
    //在mother文件夹创建一个子文件夹
    public void create02(){
        File parentFile = new File("d:\\");
        String fileName="news2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("create success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式3
    public void create03(){
        String parentPath="d:\\";
        String fileName="news3.txt";
        File file =new File(parentPath,fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

