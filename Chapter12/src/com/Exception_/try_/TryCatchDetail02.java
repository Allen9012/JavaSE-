package com.Exception_.try_;

import com.Exception_.exception_.NullPointerException_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-18
 * Time: 9:34
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {
//老韩解读
//1.如果try 代码块有可能有多个异常
//2.可以使用多个catch 分别捕获不同的异常，相应处理
/**3.要求子类异常写在前面，父类异常写在后面*/
        try {
            Person person = new Person();
            System.out.println(person.getName());//NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;//Arithmetic Exception
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }
}

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }
}