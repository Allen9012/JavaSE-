package com.ObjectMiddle.polymorphic_.PolyArray;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-10
 * Time: 23:04
 */
public class PolyArray {
    public static void main(String[] args) {
        //动态绑定机制:
            //属性是没有动态绑定机制的直接执行，方法是有的
            //当调用对象的时候，会和运行类型绑定，也就是说去找B的sum，找不到就去找父类的sum，但是父类的sum运行时
            //有两个getI方法，这里会调用运行时绑定类型的，也就是B的
        Person[] persons=new Person[5];
        persons[0]=new Person("jack",20);
        persons[1] = new Student("mary", 18, 100);
        persons[2] = new Student("smith", 19, 30.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());//动态绑定机制
            //老师提示: person[i] 编译类型是Person ,运行类型是是根据实际情况有JVM 来判断
           // 这里大家聪明. 使用类型判断+ 向下转型.
            if(persons[i] instanceof Student) {//判断person[i] 的运行类型是不是Student
                Student student = (Student)persons[i];//向下转型
                student.study();
                //小伙伴也可以使用一条语句((Student)persons[i]).study();
            } else if(persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher)persons[i];
                teacher.teach();
                //((Teacher)person[i]).teach();
            } else if(persons[i] instanceof Person){
                System.out.println("你的类型有误, 请自己检查...");
            } else {
                System.out.println("你的类型有误, 请自己检查...");
            }
        }
    }
}
