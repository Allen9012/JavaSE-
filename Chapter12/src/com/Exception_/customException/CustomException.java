package com.Exception_.customException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-18
 * Time: 12:50
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 80;
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("age should be from 18-120");
        }
        System.out.println("your age should be in right range");
    }
}

//自定义一个异常
//老韩解读
//1. 一般情况下，我们自定义异常是继承RuntimeException
//2. 即把自定义异常做成运行时异常，好处时，我们可以使用默认的处理机制
//3. 即比较方便
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}

