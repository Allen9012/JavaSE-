package com.Collection.Homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-15
 * Time: 18:20
 */



//本题的特殊情况在与hash和equals方法的重写
// 若不重写，hashCode与对象地址相关，hash值自然也没有变化，重写后hashCode与两个属性相关，每改一次都会变化一次
//为什么可以有重复的CC，因为第一个CC的hashCode是按照AA来计算的，计算完之后修改成为CC，第二个是直接通过CC来计算hashCode，所以两者不一样
public class Homework06 {
    public static void main(String[] args) {
        HashSet set = new HashSet();//ok
        Person1 p1 = new Person1(1001,"AA");//ok
        Person1 p2 = new Person1(1002,"BB");//ok
        set.add(p1);//ok
        set.add(p2);//ok
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);//2
        set.add(new Person1(1001,"CC"));
        System.out.println(set);//3
        set.add(new Person1(1001,"AA"));
        System.out.println(set);//4
    }
}
class Person1 {
    public String name;
    public int id;

    public Person1(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return id == person1.id && Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

