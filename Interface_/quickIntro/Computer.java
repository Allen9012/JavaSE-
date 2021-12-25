package com.HigherOrder.Interface_.quickIntro;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-16
 * Time: 13:08
 */
public class Computer {
    public void work(UsbInterface usbInterface){
        //transmit interface
        usbInterface.start();
        usbInterface.stop();
    }
}
