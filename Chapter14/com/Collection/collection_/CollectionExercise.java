package com.Collection.collection_;

import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-22
 * Time: 8:21
 */
public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小黄",3));
        list.add(new Dog("小黑", 3));
        list.add(new Dog("大黄", 100));
        list.add(new Dog("大壮", 8));
//先使用for 增强
        for (Object dog : list) {
            System.out.println("dog=" + dog);
        }
        Iterator iterator=list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("dog= "+next);
        }
    }


}
/**
 * 创建3 个Dog {name, age} 对象，放入到ArrayList 中，赋给List 引用
 * 用迭代器和增强for 循环两种方式来遍历
 * 重写Dog 的toString 方法， 输出name 和age
 */
class Dog {
    private String name;
    private int age;
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
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}