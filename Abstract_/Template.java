package com.HigherOrder.Abstract_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-15
 * Time: 19:50
 */
abstract public class Template {//抽象
    public abstract void job();
    public void calculate(){
        long start= System.currentTimeMillis();
        job();
        long end=System.currentTimeMillis();
        System.out.println("mission 的 execution time "+(end-start));
    }
}
