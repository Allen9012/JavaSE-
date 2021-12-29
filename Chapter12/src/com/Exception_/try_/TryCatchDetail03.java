package com.Exception_.try_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-18
 * Time: 9:46
 */
public class TryCatchDetail03 {
    public static void main(String[] args) {
//执行完之后直接崩掉了
        //要catch
        /**
可以进行try-finally 配合使用, 这种用法相当于没有捕获异常，
因此程序会直接崩掉/退出。应用场景，就是执行一段代码，不管是否发生异常，
都必须执行某个业务逻辑
*/
        try {
            int n1=10;
            int n2 = 0;
            System.out.println(n1/n2);
        } finally {
            System.out.println("execute to finally");
        }
        System.out.println("continuing");
    }
}
