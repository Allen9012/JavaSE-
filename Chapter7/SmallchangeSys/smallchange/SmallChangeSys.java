package com.project.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-12
 * Time: 11:26
 */
public class SmallChangeSys {
    //Reduce complexity to simplicity
//1.  First complete the display menu,
// and you can select the menu to give the corresponding prompt
//2.  Complete change details
//3.  Complete income entry
//4.  consumption
//5.  exit
//6.  When the user enters 4 to exit, the prompt "are you sure you want to exit?
// Y / N" will be given. You must enter the correct Y / N,
// otherwise cycle the input instruction until y or n is entered
//7. When the income is recorded and consumed,
// judge whether the amount is reasonable and give corresponding tips
    public static void main(String[] args) {
        // define related variables
        Scanner scanner = new Scanner(System.in);
        String key = "";
        boolean loop = true;
        //2. complete the change details
        //(1) 可以把收益入账和消费，保存到数组 (2) 可以使用对象 (3) 简单的话可以使用String拼接
        String details = "-----------------Change details------------------";
        //3. complete income entry
        double money = 0;
        double balance = 0;
        Date date = null; // date 是 java.util.Date 类型，表示日期
        //if you don't like the default format of displaying date ,change it with sdf
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        //4. consumption
        //define new variable，store the reason why consume
        String note = "";
        do {
            System.out.println("\n==========Small Change Menu==========");
            System.out.println("\t\t\t1 show change details");
            System.out.println("\t\t\t2 income entry");
            System.out.println("\t\t\t3 consumption");
            System.out.println("\t\t\t4 exit");
            System.out.println("please choose 1-4:");
            key = scanner.next();
            //use switch to control
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("Income recorded amount:");
                    money = scanner.nextDouble();
                    //the range of money should be limited
                    //commonly use <if> to judge the wrong situation make the code easy to read
                    //give the hits of the illegal money value 就直接break
                    if (money <= 0) {
                        System.out.println("The income entry amount must be greater than 0");
                        break;
                    }
                    balance += money;
                    //Splicing consumption information to details
                    date = new Date(); //Get the current time
                    details += "\n" + "Income " + "\t" + "+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.print("Consumption amount:");
                    money = scanner.nextDouble();
                    //the range of money should be limited
                    if (money <= 0 || money > balance) {
                        System.out.println("Your consumption amount should be 0-" + balance);
                        break;
                    }
                    System.out.print("Consumption Description:");
                    note = scanner.next();
                    balance -= money;
                    //Splicing consumption information to details
                    date = new Date();//Get the current time
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    String choice = "";
                    while (true) {
                        //The user is required to enter Y / N, otherwise it will cycle all the time
                        System.out.println("你确定要退出吗? y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                        //scheme 2
//                        if("y".equals(choice)) {
//                            loop = false;
//                            break;
//                        } else if ("n".equals(choice)) {
//                            break;
//                        }
                    }
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("err please choose again");

            }
        } while (loop);
        System.out.println(" you have exit the SmallChange");
    }
}
