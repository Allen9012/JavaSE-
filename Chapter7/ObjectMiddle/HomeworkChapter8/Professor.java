package com.ObjectMiddle.HomeworkChapter8;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-13
 * Time: 8:59
 */
public class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }
    public void introduce(){
        System.out.println("this is a professor information");
        super.introduce();
    }
}
