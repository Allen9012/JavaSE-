package com.ObjectMiddle.polymorphic_.feedAnimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-08
 * Time: 8:17
 */
public class Poly01 {
    //现在是多态性的喂动物
    public static void main(String[] args) {
        Master tom = new Master("Tom");
        Dog dog = new Dog("Jack");
        Bone big_bone = new Bone("big bone");
        tom.feed(dog,big_bone);
        Cat garfield = new Cat("Garfield");
        Fish salmon = new Fish("salmon");
        tom.feed(garfield,salmon);
        System.out.println("============================");
        //添加 给小猪喂米饭
        Pig pig = new Pig("小花猪");
        Rice rice = new Rice("大米饭");
        tom.feed(pig,rice);
    }
}
