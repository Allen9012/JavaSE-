package com.HigherOrder.Interface_.quickIntro;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-16
 * Time: 13:07
 */
public class Camera implements UsbInterface{
    public void start(){
        System.out.println("camera start working ");
    }
    public void stop(){
        System.out.println("camera stop working ");
    }
}
