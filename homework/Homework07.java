package com.homework;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-11-28
 * Time: 15:09
 */
public class Homework07 {
    public static void main(String[] args) {
        Dog dog = new Dog("黄毛 ","huang ",5);
        dog.show();
    }
}
class Dog{
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    void show(){
        System.out.println(name+color+age);
    }
}