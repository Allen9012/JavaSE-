package com.HigherOrder.codeBlock;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-15
 * Time: 11:31
 */


public class CodeBlockExercise02 {
    //主方法
    public static void main(String str[]) {
        Test a = new Test();//无参构造器
    }
//运行结果， 输出什么内容，并写出. 2min 看看
/*1. 静态成员sam 初始化
2. static 块执行
3. sam1 成员初始化
4. Test 默认构造函数被调用*/
}
class Sample {
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("Sample 默认构造函数被调用");
    }
}
class Test {
    Sample sam1 = new Sample("sam1 成员初始化");//
    static Sample sam = new Sample("静态成员sam 初始化");//

    static {
        System.out.println("static 块执行");//
        if (sam == null) System.out.println("sam is null");
    }

    Test()//构造器
    {
        System.out.println("Test 默认构造函数被调用");//
    }
}