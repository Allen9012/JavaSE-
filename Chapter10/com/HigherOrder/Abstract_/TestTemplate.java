package com.HigherOrder.Abstract_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-15
 * Time: 19:33
 */
public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculate();//找到父类

        BB bb = new BB();
        bb.calculate();
    }
}
