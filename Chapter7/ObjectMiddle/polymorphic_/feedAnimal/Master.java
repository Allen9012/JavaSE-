package com.ObjectMiddle.polymorphic_.feedAnimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-08
 * Time: 8:27
 */
public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }
    //the master give dog bone
//    public void feed(Dog dog,Bone bone){
//        System.out.println("主人 "+name+" 给 "+dog.getName()+" 吃 "+bone.getName());
//    }
//    public void feed(Cat cat,Fish fish){
//        System.out.println("主人 "+name+" 给 "+cat.getName()+" 吃 "+fish.getName());
//    }
    //使用多态机制，可以统一管理主人喂食
    //animal 编译类型是Animal，
    public void feed(Animal animal, Food food){
        System.out.println("主人 "+name+"给 "+animal.getName()+" 吃 "+food.getName() );
    }
}
