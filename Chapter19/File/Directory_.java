package com.File;

import org.testng.annotations.Test;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-31
 * Time: 14:37
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    //判断文件在不在，不在就删除
    @Test
    public void m1() {
        String filePath = "d:\\news.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + " delete success");
            } else {
                System.out.println(filePath + " delete error");
            }
        } else {
            System.out.println("file not exist");
        }
    }


    @Test
    //judge D:\\Demo\\a\\b\\c directory exist or not ,if exist then indicates it exists ,otherwise just create it
    public void m3() {
        String directoryPath="D:\\demo\\a\\b\\c";
        File file = new File(directoryPath);
        if(file.exists()){
            System.out.println(directoryPath+ "exists ..");
        }else{
            if(file.mkdirs()) {//mkdir is to create parent dir
                System.out.println(directoryPath+" create success");
            }else{
                System.out.println(directoryPath+" create failure");

            }
        }
    }
}
