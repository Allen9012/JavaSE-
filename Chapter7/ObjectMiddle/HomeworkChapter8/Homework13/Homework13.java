package com.ObjectMiddle.HomeworkChapter8.Homework13;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-13
 * Time: 11:14
 */
public class Homework13 {
    public static void main(String[] args) {
        Student student = new Student("Sheldon", "male", 18, "2035061331");
        student.printInfo();
        System.out.println("======================================================================");
        Teacher teacher = new Teacher("Zhangfei", "female", 40, 20);
        teacher.printInfo();


        //定义多态数组
        Person[] persons=new Person[4];
        persons[0]=new Student("Jack","male",10,"0001");
        persons[1]=new Student("Mary","female",12,"0002");
        persons[2]=new Teacher("Smith","male",32,5);
        persons[3]=new Teacher("Lucy","female",43,20);
        //create object
        Homework13 homework13 = new Homework13();
        homework13.bubbleSort(persons);
        //输出排序后的数组
        for (int i = 0; i < persons.length ; i++) {
            System.out.println(persons[i]);
        }


        //遍历数组，调用test方法
        System.out.println("=======================");
        for (int i = 0; i < persons.length; i++) {//遍历多态数组
            homework13.test(persons[i]);
        }

    }
    //定义方法，形参为Person类型，功能：调用学生的study或教师的teach方法
    //分析这里会使用到向下转型和类型判断
    public void test(Person p){
        if(p instanceof Student){
            ((Student) p).study();
        }else if(p instanceof Teacher){
            ((Teacher)p).teach();
        }else{
            System.out.println("do nothing");
        }
    }

    //完成年龄从高到低排序
    public void  bubbleSort(Person[] persons){
        Person temp=null;
        for(int i=0;i<persons.length-1;i++) {
            for(int j=0;j< persons.length-1-i;j++){
                //判断条件
                if(persons[j].getAge()<persons[j+1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }
}
