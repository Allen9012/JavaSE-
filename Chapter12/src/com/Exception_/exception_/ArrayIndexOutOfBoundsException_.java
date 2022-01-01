package com.Exception_.exception_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-17
 * Time: 14:25
 */
public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {
        int[]arr={1,2,4};
        for (int i = 0; i <arr.length+1; i++) {
            System.out.println(arr[i]);
        }
    }
}
