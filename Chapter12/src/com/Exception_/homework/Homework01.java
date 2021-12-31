package com.Exception_.homework;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-18
 * Time: 13:39
 */
public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //先验证输入的格式对不对
        try {
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res=cal(n1,n2);
            System.out.println("计算结果是= "+res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要输整数");
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static double cal(int n1,int n2){
        return n1/n2;
    }
}
