package com.Homework;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-17
 * Time: 18:39
 */
public class Homework02 {
    public static void main(String[] args) {
        T t = new T();
        Thread thread1 = new Thread(t);
        thread1.setName("t1");
        Thread thread2 = new Thread(t);
        thread2.setName("t2");
        thread1.start();
        thread2.start();
    }
}


//编程取款的线程
//1.因为这里涉及到多个线程共享资源，所以我们使用实现Runnable方式
//2. 每次取出 1000
class T implements Runnable {
    private int money = 10000;

    @Override
   public void run() {
        while (true) {


          synchronized (this){//加一个锁
              if (money < 1000) {    //判断够不够取
                  System.out.println("余额不足");
                  break;
              }

              money -= 1000;
              System.out.println(Thread.currentThread().getName() + "取出了1000 当前余额="+money);
          }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}