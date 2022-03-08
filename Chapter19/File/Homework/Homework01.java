package com.File.Homework;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-18
 * Time: 9:25
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        /**
         *(1) 在判断e盘下是否有文件夹mytemp ,如果没有就创建mytemp
         *(2) 在e:\\mytemp 目录下, 创建文件 hello.txt
         *(3) 如果hello.txt 已经存在，提示该文件已经存在，就不要再重复创建了
         *(4) 并且在hello.txt 文件中，写入 hello,world~
         */

        String directoryPath = "e:\\mytemp";
        File file = new File(directoryPath);
        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println("创建成功");
            } else {
                System.out.println("创建失败");
            }
        }else {
            System.out.println("文件夹已经创建");
        }
        String filepath = directoryPath + "\\hello.txt";// e:\mytemp\hello.txt
        File file1 = new File(filepath);
        if (!file1.exists()) {
            if (file1.createNewFile()) {
                System.out.println("成功创建");
                FileOutputStream fileOutputStream = new FileOutputStream(filepath);
                String str = "hello world";
                fileOutputStream.write(str.getBytes(), 0, str.length());
                fileOutputStream.close();
            } else {
                System.out.println(filepath+"创建失败");
            }
        } else {
            System.out.println(filepath+"文件已经存在,不重复创建");
        }
    }

}
