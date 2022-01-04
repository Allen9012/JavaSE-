package com.ObjectMiddle.HomeworkChapter8.Homework13;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-13
 * Time: 11:16
 */
public class Teacher extends Person{
    private int work_age;

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public Teacher(String name, String gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("I promise that i will teach hard");
    }
    public String play(){
        return "teacher "+super.play()+"chess ";
    }
    public void printInfo(){
        System.out.println("the teacher information");
        System.out.println(basicInfo());
        System.out.println("student id : "+work_age);
        teach();//组合变化灵活
        System.out.println(play());//不能调super.play,父类也有play，子类重写了
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}'+super.toString();
    }
}
