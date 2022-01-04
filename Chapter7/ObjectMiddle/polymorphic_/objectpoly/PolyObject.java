package com.ObjectMiddle.polymorphic_.objectpoly;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-09
 * Time: 18:52
 */
public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态

        //编译类型确定Animal ，运行类型Dog
        Animal animal = new Dog();
        animal.cry();//因为运行时，这时执行到该行时animal的运行类型是dog
        //运行类型成了猫
        animal=new Cat();
        animal.cry();
    }
}
