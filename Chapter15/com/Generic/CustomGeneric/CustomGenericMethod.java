package com.Generic.CustomGeneric;

import java.awt.image.ImageConsumer;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-17
 * Time: 11:31
 */
@SuppressWarnings({"all"})
public class CustomGenericMethod {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马",100);//当调用方法时，传入参数，编译器，就会确定类型
        //然后自动装箱
        car.fly(300,100.1);//当调用方法时，传入参数，编译器，就会确定类型
        //测试
        //T->String, R-> ArrayList
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(), 11.3f);
    }
}

class Car {//普通类

    public void run() {//普通方法

    }

    //说明
    //1. <T,R> 就是泛型
    // 2. 是提供给 fly使用的
    public <T, R> void fly(T t, R r) {//泛型方法
        System.out.println(t.getClass());//string
        System.out.println(r.getClass());//Integer
    }
}

class Fish<T, R> {//泛型类

    public void run() {//普通方法
    }
    public<U,M> void eat(U u, M m) {//泛型方法

    }
    //说明
    //1. 下面hi方法不是泛型方法，因为没有标识符
    //2. 是hi方法使用了类声明的 泛型和泛型方法是不一样的
    public void hi(T t) {
    }
    //泛型方法，可以使用类声明的泛型，也可以使用自己声明泛型
    public<K> void hello(R r, K k) {
        System.out.println(r.getClass());//ArrayList
        System.out.println(k.getClass());//Float
    }

}
