package com.HigherOrder.Abstract_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-15
 * Time: 18:16
 */
public class AbstractDetail02 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
abstract class H{
    //static is not compatible with abstract
    //public static abstract void hi();
}
abstract class E{
    public abstract void hi();
}
abstract class F extends E{

}
class G extends F{
    @Override
    public void hi() {//realize father's class only blanket is also called realization it

    }
}