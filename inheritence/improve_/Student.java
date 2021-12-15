package com.inheritence.improve_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-02
 * Time: 14:22
 */
//父类
public class Student {
    //共有的属性
    public String name;
    public int age;
    private double score;
    //共有的方法
    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo(){
        System.out.println("学生名 "+name+" 年龄 "+age +" 成绩 "+score);
    }
}
