package com.inheritence;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-02
 * Time: 14:08
 */
public class Pupils {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        System.out.println("小学生"+name+" 正在考小学数学..." );
    }
    public void showInfo(){
        System.out.println("小学生名 "+name+" 年龄 "+age +" 成绩 "+score);
    }
}
