package com.ObjectMiddle.override_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-06
 * Time: 10:37
 */
public class Student extends Person{
    private  int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String say(){
        //经典的一种重写方法，也体现super的好用
        return super.say()+" id="+id+" score=" +score;
    }
}
