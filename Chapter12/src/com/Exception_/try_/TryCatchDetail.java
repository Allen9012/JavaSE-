package com.Exception_.try_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-17
 * Time: 16:08
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        //ctrl + atl + t
//老韩解读
//1. 如果异常发生了，则异常发生后面的代码不会执行，直接进入到catch 块
//2. 如果异常没有发生，则顺序执行try 的代码块，不会进入到catch
//3. 如果希望不管是否发生异常，都执行某段代码(比如关闭连接，释放资源等)则使用如下代码- finally
        try {
            String str="hsp";
            int a=Integer.parseInt(str);
            System.out.println("数字： "+a);
        } catch (NumberFormatException e) {
            System.out.println("the exception detail = "+e.getMessage());
        }finally {
            System.out.println("proceeding......");
        }
    }
}
