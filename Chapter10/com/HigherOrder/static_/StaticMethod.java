package com.HigherOrder.static_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-14
 * Time: 18:58
 */
public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        Stu.payFee(100);
        Stu mary = new Stu("mary");
        Stu.payFee(200);
        Stu.showFee();
    }
}
class Stu{
    private String name;//common member
    private static double fee= 0;

    public Stu(String name) {
        this.name = name;
    }
    //when modify by static ,that method is static method
    public static void payFee(double fee){
        Stu.fee+=fee;
    }
    public static void showFee(){
        System.out.println("total fee is: "+Stu.fee);
    }
}
