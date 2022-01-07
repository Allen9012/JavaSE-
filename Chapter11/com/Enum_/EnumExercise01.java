package com.Enum_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-04
 * Time: 12:39
 */
public class EnumExercise01 {
    public static void main(String[] args) {
         Gender boy =Gender.Boy;
         Gender boy2=Gender.Boy;
        System.out.println(boy);//看看toString应该是父类的toString方法也就是Enum类
        System.out.println(boy2==boy);//T

//         Enum;
//        public String toString() {
//            return name;
//        }

        //返回名字说明输出的就是BOY
    }
}
enum Gender{
    //use no parameter constructor then we can use enum directly,
    // but if we create a have-parameter constructor, that's wrong

    Boy(),
    Girl();
    private String name;
    private Gender(String name){

    }
    private Gender(){

    }
}