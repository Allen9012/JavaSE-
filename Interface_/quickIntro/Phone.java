package com.HigherOrder.Interface_.quickIntro;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-16
 * Time: 13:05
 */

//class phone need to realize the interface declared method
public class Phone implements UsbInterface{
    public void start(){
        System.out.println("phone start working ");
    }
    public void stop(){
        System.out.println("phone stop working ");
    }
}
