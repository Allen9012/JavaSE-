package com.Generic.Improve;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-28
 * Time: 19:46
 */
@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("小黄", 5));
        arrayList.add(new Dog("大黄", 8));
        //arrayList.add(new Cat("招财猫",5));//加入了一个数据类型的约束
        for (Dog dog :arrayList) {
            System.out.println(dog.getName()+"-"+dog.getName());
        }

    }
}
class Dog{
    private String name;
    private int age ;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat { //Cat 类
    private String name;
    private int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}