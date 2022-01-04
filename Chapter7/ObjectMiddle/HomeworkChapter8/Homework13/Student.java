package com.ObjectMiddle.HomeworkChapter8.Homework13;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-13
 * Time: 11:14
 */
public class Student extends Person{
    private String stu_id;

    public Student(String name, String gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("I promise that i will study hard ");
    }
    public String play(){
        return "student "+super.play()+"football ";
    }
    public void printInfo(){
        System.out.println("the student information");
        System.out.println(basicInfo());
        System.out.println("student id : "+stu_id);
        study();//组合变化灵活
        System.out.println(play());//不能调super.play
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}'+super.toString();
    }
}
