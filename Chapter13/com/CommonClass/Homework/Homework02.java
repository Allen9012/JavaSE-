package com.CommonClass.Homework;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-21
 * Time: 20:17
 */


import java.nio.file.attribute.UserDefinedFileAttributeView;

/**
 * 输入用户名、密码、邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
 * 要求：
 * (1) 用户名长度为2或3或4
 * (2) 密码的长度为6，要求全是数字  isDigital
 * (3) 邮箱中包含@和.   并且@在.的前面
 * <p>
 * 思路分析
 * (1) 先编写方法 userRegister(String name, String pwd, String email) {}
 * (2) 针对 输入的内容进行校核，如果发现有问题，就抛出异常，给出提示
 * (3) 单独的写一个方法，判断 密码是否全部是数字字符 boolean
 */
public class Homework02 {
    public static void main(String[] args) {
        String name = "abc";
        String pwd = "123456";
        String email = "ti@i@sohu.com";
        try {
            userRegister(name,pwd,email);
            System.out.println("congratulations");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void userRegister(String name, String pwd, String email) {
        //overcome all the difficulties in the way
        int length = name.length();
        if (!(name.length() >= 2 && name.length() <= 4)) {
            throw new RuntimeException("名字不对");
        }
        if (!(pwd.length() == 6 &&IsDigital(pwd))){
            throw new RuntimeException("密码不对");
        }
        int i=email.indexOf('@');
        int j=email.indexOf('.');
        if((i>0&&j>i)){
            throw new RuntimeException("邮箱输错");
        }
    }

    public static boolean IsDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9')
                return false;
        }
        return true;
    }
}
