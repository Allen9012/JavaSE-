package com.ObjectMiddle.Object;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-11
 * Time: 16:38
 */
public class EqualsExercise03 {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65 和65.0f 是否相等？" + (it == fl));//T
        char ch1 = 'A'; char ch2 = 12;
        System.out.println("65 和'A'是否相等？" + (it == ch1));//T
        System.out.println("12 和ch2 是否相等？"+ (12 == ch2));//T
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1 和str2 是否相等？"+ (str1 == str2)); //F
        System.out.println("str1 是否equals str2？"+(str1.equals(str2)));//T
//        System.out.println("hello" == new java.sql.Date()); //编译错误
    }
}
