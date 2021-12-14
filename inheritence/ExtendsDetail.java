package com.inheritence;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-03
 * Time: 13:23
 */
public class ExtendsDetail {
    public static void main(String[] args) {
        Sub sub = new Sub();
//        sub.sayOk();
        System.out.println("=======第二个对象=======");
        Sub sub1 = new Sub("jack",20);
    }
}
