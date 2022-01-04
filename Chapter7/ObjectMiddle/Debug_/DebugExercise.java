package com.ObjectMiddle.Debug_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-12
 * Time: 11:17
 */
public class DebugExercise {
    public static void main(String[] args) {
        //创建对象的流程
        //加载person信息
        //初始化
        //返回对象的信息
        Person jack = new Person("Jack",18);
        System.out.println(jack);
    }
}
class Person{
    private String name;
    private  int age;

    public Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}