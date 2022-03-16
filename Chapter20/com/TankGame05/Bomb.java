package com.TankGame05;

import com.sun.corba.se.spi.orb.ParserImplBase;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-02-16
 * Time: 19:30
 */
public class Bomb {
    int x,y;//炸弹的坐标
    int life=9;//炸弹的生命周期
    boolean isLive=true;
    public Bomb(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void lifeDown(){
        if(life>0){
            life--;
        }else{
            isLive=false;
        }
    }
}
