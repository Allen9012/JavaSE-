package com.Exception_.homework;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-18
 * Time: 13:53
 */
public class Homework02 {
    public static void main(String[] args) {
        try {
            if(args[4].equals("john")){
                System.out.println("AA");
            }else{
                System.out.println("BB");
            }
            Object o=args[2];
            Integer i=(Integer) o;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("空指针异常");
        }catch(ClassCastException e){
            System.out.println("强转错误");
        }

    }
}
