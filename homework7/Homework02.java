package com.homework;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-11-28
 * Time: 12:35
 */

public class Homework02 {

    public static void main(String[] args) {
String[] strs={"jack","tom","mary","milan"};
        A02 a02 = new A02();
        int index=a02.find("hsp",strs);
        System.out.println("查找的index是："+index);
    }
}
class A02{
    public int find(String findStr,String[]strs){
        for (int i = 0; i <strs.length ; i++) {
            if(findStr.equals(strs[i])){
                return i;
            }
        }
        //没有就返回-1
        return -1;
    }
}