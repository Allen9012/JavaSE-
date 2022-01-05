package com.HigherOrder.static_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-14
 * Time: 18:06
 */
public class ChildGame {
    public static void main(String[] args) {

        Child flash = new Child("flash");
        flash.join();
        flash.count++;
        Child batman = new Child("batman");
        batman.join();
        batman.count++;
        Child superman = new Child("superman");
        superman.join();
        superman.count++;
        System.out.println("There is "+Child.count+" heroes join the game");
    }
}
class Child{
    private String name;
    public  static int count=0;
    public Child(String name) {
        this.name = name;
    }

    public void join(){
        System.out.println(name+ " join the game");
    }


}