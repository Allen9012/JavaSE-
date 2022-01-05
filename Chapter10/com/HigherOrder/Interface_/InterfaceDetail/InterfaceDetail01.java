package com.HigherOrder.Interface_.InterfaceDetail;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-16
 * Time: 14:00
 */
public class InterfaceDetail01 {
    public static void main(String[] args) {

    }
}
interface IA{
    //接口中所有的方法都是public+default
    void say();
    void hi();
}
class Cat implements IA{

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
abstract class Dog implements IA{
   //抽象类去实现接口时可以不去实现
}