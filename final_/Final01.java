package com.HigherOrder.final_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-15
 * Time: 12:42
 */
public class Final01 {
    public static void main(String[] args) {
        E e = new E();
//        e.TAX_RATE=100.0;
    }
}
//final class can't be inherited
final class A{

}
//class B extends A{}
class C{
    public final void hi(){

    }
}
class D extends C{
//    @Override
//    public void hi(){
//        System.out.println("override c method hi()");
//    }
}

class E{
    public final double TAX_RATE =0.09;
}
class F{
    public void cry(){
        //this time NUM is called Local constant
        double NUM=0.01;
        NUM=0.9;
        System.out.println("NUM= "+NUM);
    }
}