package com.tankGame3;

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

    public Hero(int x, int y) {
        super(x, y);
    }

    public void shotEnemyTank(){
        //create Shot object,basic on Hero's direction and location
        switch (getDirect()){
            case 0:
                //x and y location must be at the shot cannon not the same with the tank
                shot=new Shot(getX()+10,getY()+20,0);
                break;
            case 1:
                shot=new Shot(getX()+60,getY()+20,1);
                break;
            case 2:
                shot=new Shot(getX()+20,getY()+60,2);
                break;
            case 3:
                shot=new Shot(getX(),getY()+20,3);
                break;
        }
        //start the thread go to shot
        new Thread(shot).start();

    }

}
