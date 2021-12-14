package com.inheritence;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-03
 * Time: 13:24
 */
public class Base {//父类
    //4个属性
    public int n1=100;
    protected  int n2=200;
    int n3=300;
    private int n4=400;
//    public Base(){
//        //无参构造器
//        System.out.println("父类的base()构造器被调用....");
//    }
    public Base(String name ,int age){
        System.out.println("父类Base(String name ,int age)构造器被调用");
    }
    public Base(String name){
        System.out.println("父类Base(String name)构造器被调用");
    }
    //父类提供public的方法
    public int getN4(){
        return n4;
    }
    public void test100(){
        System.out.println("test100");
    }
    public void test200(){
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }
    //call
    public void callTest400(){
        test400();
    }
}
