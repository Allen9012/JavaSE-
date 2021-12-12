package com.encapsulation;

import java.security.PrivateKey;
import java.security.PrivilegedExceptionAction;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-02
 * Time: 8:47
 */
public class Testdemo1 {
    public static void main(String[] args) {
        Person person = new Person();
       person.setAge(15);
       person.setName("jack");
       person.setSalary(30000);
        System.out.println(person.info());
        System.out.println("=======smith的信息如下======");
        Person person1 = new Person("smith",2000,50000);
    }
}

class Person {
    public String name;
    private int age;
    private double salary;
//构造器
    //无参
public Person(){

}
//有参
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setSalary(salary);
        setName(name);
        setAge(age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度不对，需要2-6个字符，默认名字");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0&&age<120){
            this.age = age;
        }else{
            System.out.println("年龄不对，初始化为默认值" );
            this.age=18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info(){
        return "name="+name+" age="+age+" salary="+salary;
    }
}
