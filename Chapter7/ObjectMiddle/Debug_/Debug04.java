package com.ObjectMiddle.Debug_;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-12
 * Time: 11:15
 */
public class Debug04 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 10, -20 , 100};
//我们看看Arrays.sort 方法底层实现.->Debug
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
        System.out.println("hello500");
        System.out.println("hello600");
        System.out.println("hello700");
    }
}
