package com.Collection.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-23
 * Time: 11:33
 */



//本题难点在于MyDate写成内部类
    //然后注意equals和hashcode方法要重写两次
/*定义一个Employee类,该类包含: private成员属性name,sal,birthday(MyDate类型),
        其中birthday为MyDate类型(属性包括: year, month, day),
        要求:
        1,创建3个Employee放入HashSet中
        2,当name和birthday的值相同时,认为是相同员工,不能添加到HashSet集合中*/
public class HashsetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee2("jack",10000,new Employee2.MyDate(12,2002,3)));
        hashSet.add(new Employee2("jack",10000,new Employee2.MyDate(12,2002,3)));
        hashSet.add(new Employee2("lucy",10000,new Employee2.MyDate(12,2002,3)));
        System.out.println("Hashset= "+hashSet);
    }
}
class Employee2{
    private String name;
    private double sal;
    private MyDate Birthday;
    static class MyDate{
        int month;
        int year;
        int day;

        public MyDate(int month, int year, int day) {
            this.month = month;
            this.year = year;
            this.day = day;
        }

        @Override
        public String toString() {
            return
                    '{'+"month=" + month +
                    ", year=" + year +
                    ", day=" + day
                    ;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyDate myDate = (MyDate) o;
            return month == myDate.month && year == myDate.year && day == myDate.day;
        }

        @Override
        public int hashCode() {
            return Objects.hash(month, year, day);
        }
    }

    public Employee2(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        Birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return Birthday;
    }

    public void setBirthday(MyDate birthday) {
        Birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", Birthday=" + Birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return Objects.equals(name, employee2.name) && Objects.equals(Birthday, employee2.Birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Birthday);
    }
}
