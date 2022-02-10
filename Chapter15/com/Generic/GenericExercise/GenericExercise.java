package com.Generic.GenericExercise;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-28
 * Time: 21:22
 */
public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("jack",18));
        students.add(new Student("tom",10));
        students.add(new Student("mary",15));

        //遍历
        for (Student student :students) {
            System.out.println(student);
        }
        HashMap<String, Student> hm = new HashMap<String, Student>();
        hm.put("tom",new Student("tom",28));
        hm.put("milan",new Student("milan",28));
        hm.put("hsp",new Student("hsp",28));
        hm.put("allen",new Student("allen",28));

        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}