package com.ObjectMiddle.override_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-06
 * Time: 10:21
 */
public class Dog extends Animal{
   //名称一样，返回参数一样，就可以重写
    public void cry(){
        System.out.println("小狗叫");
    }
    public String m1() {
        return null;
    }
}
