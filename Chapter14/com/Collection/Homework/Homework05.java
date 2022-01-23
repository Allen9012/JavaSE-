package com.Collection.Homework;

import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-15
 * Time: 18:08
 */
public class Homework05 {
    public static void main(String[] args) {
        //分析源码
        //add 方法，因为 TreeSet() 构造器没有传入Comparator接口的匿名内部类

        //这里是关键，如果没有时间实现这个接口就会报错，这里的转换就会报错，所以一定要实现这个接口
        //所以在底层 Comparable<? super K> k = (Comparable<? super K>) key;

        //即把 Person 转成 Comparable类型
        TreeSet treeSet = new TreeSet();
        //为什么会报异常，因为treeSet()一定要实现comparator接口的匿名内部类，person里面没有就会报错
        //所以重写compare方法是可以传入null的
        treeSet.add(new Person());//会报异常

    }
}
//class Person{
//
//}
class Person implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;//返回0相当于两个东西是相等的，所以加不进去
    }
}