package com.TankGame06;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-31
 * Time: 13:46
 */
public class Hero extends Tank {
//create a shot object
    Shot shot =null;
    Vector<Shot> shots=new Vector<>();
    public Hero(int x, int y) {
        super(x, y);
    }

    public void shotEnemyTank(){
        //多于5颗，直接结束
        if(shots.size()==5){
            return;
        }
        //create Shot object,basic on Hero's direction and location
        switch (getDirect()){
            case 0:
                //x and y location must be at the shot cannon not the same with the tank
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1: //向右
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2: //向下
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3: //向左
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }
        shots.add(shot);

        //start the thread go to shot
        new Thread(shot).start();

    }

}
