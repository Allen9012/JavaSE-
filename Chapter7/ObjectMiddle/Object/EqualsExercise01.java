package com.ObjectMiddle.Object;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-11
 * Time: 16:20
 */
public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person2 = new Person("jack", 10, "male");
        Person person1 = new Person("jack", 11, "male");
        System.out.println(person1.equals(person2));//没重写还是假的
    }
}
//需要重写一下equals方法

class Person{
    private String name;
    private int age;
    private String gender;
public boolean equals(Object obj){
    //先判断是不是两个对象是同一个对象，是直接返回true
    if(this==obj){//this 是当前对象
        return true;
    }
    //类型判断
    if(obj instanceof Person){
        //是Person这个对象底下的就向下转型 ，因为我要得到改=该person的每个属性
        Person p=(Person) obj;
        return this.name.equals(p.name) &&
               this.age==p.age &&//  int and char use == to compare
                this.gender.equals(p.gender);
    }
    return false;
}
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}