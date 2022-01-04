package com.ObjectMiddle.polymorphic_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-09
 * Time: 18:18
 */
public class PolyMethod {
    public static void main(String[] args) {
        A a = new A();
        //sum 方法本身是一个多态
        System.out.println(a.sum(10,20));
        System.out.println(a.sum(10,20,30));
        B b = new B();
        a.say();
        b.say();
    }
}
class B{
    public void say(){
        System.out.println("B类say() 方法被调用");
    }
}
class A extends B{//子类
    public int sum(int n1,int n2){
        return n1+n2;
    }
    public int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public void say(){
        System.out.println("A类say() 方法被调用");
    }

}