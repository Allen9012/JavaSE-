package com.encapsulation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-02
 * Time: 13:47
 */
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setPwd("123456");
        account.setBalance(30);
        account.showInfo();
    }
}
