package com.ObjectMiddle.polymorphic_.detail;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-09
 * Time: 21:16
 */
public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);
        Object obj = new Object();
        System.out.println(obj instanceof AA);//false
        String str = "hello";
        //System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);//true
    }
}

//aa 编译类型AA, 运行类型是BB
//BB 是AA 子类

class AA{

}
class BB extends AA{

}