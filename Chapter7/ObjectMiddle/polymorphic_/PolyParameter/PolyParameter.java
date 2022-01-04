package com.ObjectMiddle.polymorphic_.PolyParameter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-12-11
 * Time: 10:35
 */
public class PolyParameter {
    public static void main(String[] args) {
        Clerk tom = new Clerk("tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(milan);
        polyParameter.testWork(tom);
        polyParameter.testWork(milan);
    }
    public void showEmpAnnual(Employee e){
        //实现获取任何员工对象的年工资,并在main 方法中调用该方法[e.getAnnual()]
        System.out.println(e.getAnnual());
    }
    //添加一个方法，testWork,如果是普通员工，则调用work 方法，如果是经理，则调用manage 方法
    public void testWork(Employee e) {
        if(e instanceof Clerk) {
            ((Clerk) e).work();//有向下转型操作
        } else if(e instanceof Manager) {
            ((Manager) e).manage();//有向下转型操作
        } else {
            System.out.println("不做处理...");
        }
}
}
