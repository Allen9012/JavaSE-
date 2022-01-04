package com.ObjectMiddle.polymorphic_.PolyArray;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-10
 * Time: 22:58
 */
public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    //重写父类say
    public String say(){
        return "学生 "+super.say()+ "score= "+score;
    }
 public void study(){
     System.out.println("学生 "+getName()+" 正在学习Java ");
 }
}
