package com.HigherOrder.Interface_.BasicIntro;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-16
 * Time: 13:39
 */
public interface AInterface {
    public int n1=10;
    //in the interface ,we can ues abstract method without modifying with abstract
    default public void hi(){
        System.out.println("ok......");
    }
    public static void say(){
        System.out.println("cry......");
    }
}
