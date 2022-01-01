package com.Exception_.exception_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-17
 * Time: 14:25
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "韩顺平教育";
//将String 转成int
        int num = Integer.parseInt(name);//抛出NumberFormatException
        System.out.println(num);//1234

    }
}

