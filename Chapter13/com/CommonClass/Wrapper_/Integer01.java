package com.CommonClass.Wrapper_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-18
 * Time: 22:05
 */
public class Integer01 {
    public static void main(String[] args) {
        //演示int <--> Integer 的装箱和拆箱
//jdk5 前是手动装箱和拆箱
//手动装箱int->Integer
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
//手动拆箱
//Integer -> int
        int i = integer.intValue();
//jdk5 后，就可以自动装箱和自动拆箱
        int n2 = 200;
//自动装箱int->Integer
        Integer integer2 = n2; //底层使用的是Integer.valueOf(n2)
//自动拆箱Integer->int
        int n3 = integer2; //底层仍然使用的是intValue()方法
    }
}
