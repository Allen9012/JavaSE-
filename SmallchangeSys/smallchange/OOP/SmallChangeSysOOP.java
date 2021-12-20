package com.project.smallchange.OOP;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-12
 * Time: 20:07
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * This class is used to complete various functions of zero money pass
 * Using OOP (object-oriented programming)
 * Each function corresponds to a method
 */
public class SmallChangeSysOOP {
    //basic variables
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    //display details
    String details = "-----------------Change details------------------";

    //income
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    // consume
    String note = "";

    public void mainMenu() {
        do {

            System.out.println("\n================Small Change Menu(OOP)===============");
            System.out.println("\t\t\t1 show change details");
            System.out.println("\t\t\t2 income entry");
            System.out.println("\t\t\t3 consumption");
            System.out.println("\t\t\t4 exit");
            System.out.println("please choose 1-4:");
            key = scanner.next();

            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("Choose the wrong number please choose again");
            }

        } while (loop);
    }


    public void detail() {
        System.out.println(details);
    }

    public void income() {
        System.out.print("Income recorded amount:");
        money = scanner.nextDouble();

        if (money <= 0) {
            System.out.println("The income entry amount must be greater than 0");
            return; //exit and do not execute next sentence.change break to return
        }
        balance += money;
        date = new Date();
        details += "\nIncome \t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void pay() {
        System.out.print("Consumption amount:");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("Your consumption amount should be 0-" + balance);
            return;
        }
        System.out.print("consumption description:");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //退出
    public void exit() {
        //When the user enters 4 to exit, the prompt "are you sure you want to exit?
        // Y / N" will be given. You must enter the correct Y / n
        String choice = "";
        while (true) {
            System.out.println("are you really gonna exit? y/n");
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
    }
}
