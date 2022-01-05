package com.HigherOrder.Abstract_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-15
 * Time: 17:11
 */
public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal{
    private String name;
//这里eat实现了但是没有什么意义
    public Animal(String name) {
        this.name = name;
    }
    //思考：这里eat 这里你实现了，其实没有什么意义
//即： 父类方法不确定性的问题
//===> 考虑将该方法设计为抽象(abstract)方法
//===> 所谓抽象方法就是没有实现的方法
//===> 所谓没有实现就是指，没有方法体
//===> 当一个类中存在抽象方法时，需要将该类声明为abstract 类
//===> 一般来说，抽象类会被继承，有其子类来实现抽象方法.
    public  abstract void eat();


}