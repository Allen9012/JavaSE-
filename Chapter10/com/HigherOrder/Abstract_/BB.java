package com.HigherOrder.Abstract_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-15
 * Time: 19:35
 */
public class BB extends Template{

    public void job() {//重写了template
        //get start
        long num = 0;
        for (int i = 0; i <= 80000; i++) {
            num *= i;
        }

    }
}
