package com.TankGame05;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-02-02
 * Time: 21:21
 */
public class Enemy extends Tank implements Runnable {
    Vector<Shot> shots = new Vector();
    boolean isLive = true;

    public Enemy(int x, int y) {
        super(x, y);
    }


    //下面开始分析改进坦克重合的问题
    //增加成员，EnemyTank 可以得到敌人坦克的Vector
    //分析
    //1. Vector<EnemyTank> 在
    Vector<Enemy> enemies = new Vector<>();

    //这里提供一个方法，可以将MyPanel 的成员 Vector<EnemyTank> enemyTanks = new Vector<>();
    //设置到 EnemyTank 的成员 enemyTanks
    public void setEnemies(Vector<Enemy> enemies) {
        this.enemies = enemies;
    }

    //编写方法，判断当前的这个敌人坦克，是否和 enemyTanks 中的其他坦克发生的重叠或者碰撞
    public boolean isTouchEnemyTank() {
        switch (this.getDirect()) {//其实this可以不加
            case 0: //上
                //让当前敌人坦克和其它所有的敌人坦克比较
                for (int i = 0; i < enemies.size(); i++) {
                    //从vector 中取出一个敌人坦克
                    Enemy enemy = enemies.get(i);
                    //不和自己比较
                    if (enemy != this) {
                        //如果敌人坦克是上/下
                        //老韩分析
                        //1. 如果敌人坦克是上/下 x的范围 [enemyTank.getX(), enemyTank.getX() + 40]
                        //                     y的范围 [enemyTank.getY(), enemyTank.getY() + 60]

                        if (enemy.getDirect() == 0 || enemy.getDirect() == 2) {
                            //2. 当前坦克 左上角的坐标 [this.getX(), this.getY()]
                            if (this.getX() >= enemy.getX()
                                    && this.getX() <= enemy.getX() + 40
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 60) {
                                return true;
                            }
                            //3. 当前坦克 右上角的坐标 [this.getX() + 40, this.getY()]
                            if (this.getX() + 40 >= enemy.getX()
                                    && this.getX() + 40 <= enemy.getX() + 40
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌人坦克是 右/左
                        //老韩分析
                        //1. 如果敌人坦克是右/左  x的范围 [enemyTank.getX(), enemyTank.getX() + 60]
                        //                     y的范围 [enemyTank.getY(), enemyTank.getY() + 40]
                        if (enemy.getDirect() == 1 || enemy.getDirect() == 3) {
                            //2. 当前坦克 左上角的坐标 [this.getX(), this.getY()]
                            if (this.getX() >= enemy.getX()
                                    && this.getX() <= enemy.getX() + 60
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 40) {
                                return true;
                            }
                            //3. 当前坦克 右上角的坐标 [this.getX() + 40, this.getY()]
                            if (this.getX() + 40 >= enemy.getX()
                                    && this.getX() + 40 <= enemy.getX() + 60
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 40) {
                                return true;
                            }
                        }
                    }

                }
                break;
            case 1: //右
                //让当前敌人坦克和其它所有的敌人坦克比较
                for (int i = 0; i < enemies.size(); i++) {
                    //从vector 中取出一个敌人坦克
                    Enemy enemy = enemies.get(i);
                    //不和自己比较
                    if (enemy != this) {
                        //如果敌人坦克是上/下
                        //老韩分析
                        //1. 如果敌人坦克是上/下 x的范围 [enemyTank.getX(), enemyTank.getX() + 40]
                        //                     y的范围 [enemyTank.getY(), enemyTank.getY() + 60]

                        if (enemy.getDirect() == 0 || enemy.getDirect() == 2) {
                            //2. 当前坦克 右上角的坐标 [this.getX() + 60, this.getY()]
                            if (this.getX() + 60 >= enemy.getX()
                                    && this.getX() + 60 <= enemy.getX() + 40
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 60) {
                                return true;
                            }
                            //3. 当前坦克 右下角的坐标 [this.getX() + 60, this.getY() + 40]
                            if (this.getX() + 60 >= enemy.getX()
                                    && this.getX() + 60 <= enemy.getX() + 40
                                    && this.getY() + 40 >= enemy.getY()
                                    && this.getY() + 40 <= enemy.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌人坦克是 右/左
                        //老韩分析
                        //1. 如果敌人坦克是右/左  x的范围 [enemyTank.getX(), enemyTank.getX() + 60]
                        //                     y的范围 [enemyTank.getY(), enemyTank.getY() + 40]
                        if (enemy.getDirect() == 1 || enemy.getDirect() == 3) {
                            //2. 当前坦克 右上角的坐标 [this.getX() + 60, this.getY()]
                            if (this.getX() + 60 >= enemy.getX()
                                    && this.getX() + 60 <= enemy.getX() + 60
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 40) {
                                return true;
                            }
                            //3. 当前坦克 右下角的坐标 [this.getX() + 60, this.getY() + 40]
                            if (this.getX() + 60 >= enemy.getX()
                                    && this.getX() + 60 <= enemy.getX() + 60
                                    && this.getY() + 40 >= enemy.getY()
                                    && this.getY() + 40 <= enemy.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2: //下
                //让当前敌人坦克和其它所有的敌人坦克比较
                for (int i = 0; i < enemies.size(); i++) {
                    //从vector 中取出一个敌人坦克
                    Enemy enemy = enemies.get(i);
                    //不和自己比较
                    if (enemy != this) {
                        //如果敌人坦克是上/下
                        //老韩分析
                        //1. 如果敌人坦克是上/下 x的范围 [enemyTank.getX(), enemyTank.getX() + 40]
                        //                     y的范围 [enemyTank.getY(), enemyTank.getY() + 60]

                        if (enemy.getDirect() == 0 || enemy.getDirect() == 2) {
                            //2. 当前坦克 左下角的坐标 [this.getX(), this.getY() + 60]
                            if (this.getX() >= enemy.getX()
                                    && this.getX() <= enemy.getX() + 40
                                    && this.getY() + 60 >= enemy.getY()
                                    && this.getY() + 60 <= enemy.getY() + 60) {
                                return true;
                            }
                            //3. 当前坦克 右下角的坐标 [this.getX() + 40, this.getY() + 60]
                            if (this.getX() + 40 >= enemy.getX()
                                    && this.getX() + 40 <= enemy.getX() + 40
                                    && this.getY() + 60 >= enemy.getY()
                                    && this.getY() + 60 <= enemy.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌人坦克是 右/左
                        //老韩分析
                        //1. 如果敌人坦克是右/左  x的范围 [enemyTank.getX(), enemyTank.getX() + 60]
                        //                     y的范围 [enemyTank.getY(), enemyTank.getY() + 40]
                        if (enemy.getDirect() == 1 || enemy.getDirect() == 3) {
                            //2. 当前坦克 左下角的坐标 [this.getX(), this.getY() + 60]
                            if (this.getX() >= enemy.getX()
                                    && this.getX() <= enemy.getX() + 60
                                    && this.getY() + 60 >= enemy.getY()
                                    && this.getY() + 60 <= enemy.getY() + 40) {
                                return true;
                            }
                            //3. 当前坦克 右下角的坐标 [this.getX() + 40, this.getY() + 60]
                            if (this.getX() + 40 >= enemy.getX()
                                    && this.getX() + 40 <= enemy.getX() + 60
                                    && this.getY() + 60 >= enemy.getY()
                                    && this.getY() + 60 <= enemy.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 3: //左
                //让当前敌人坦克和其它所有的敌人坦克比较
                for (int i = 0; i < enemies.size(); i++) {
                    //从vector 中取出一个敌人坦克
                    Enemy enemy = enemies.get(i);
                    //不和自己比较
                    if (enemy != this) {
                        //如果敌人坦克是上/下
                        //老韩分析
                        //1. 如果敌人坦克是上/下 x的范围 [enemyTank.getX(), enemyTank.getX() + 40]
                        //                     y的范围 [enemyTank.getY(), enemyTank.getY() + 60]

                        if (enemy.getDirect() == 0 || enemy.getDirect() == 2) {
                            //2. 当前坦克 左上角的坐标 [this.getX(), this.getY() ]
                            if (this.getX() >= enemy.getX()
                                    && this.getX() <= enemy.getX() + 40
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 60) {
                                return true;
                            }
                            //3. 当前坦克 左下角的坐标 [this.getX(), this.getY() + 40]
                            if (this.getX() >= enemy.getX()
                                    && this.getX() <= enemy.getX() + 40
                                    && this.getY() + 40 >= enemy.getY()
                                    && this.getY() + 40 <= enemy.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌人坦克是 右/左
                        //老韩分析
                        //1. 如果敌人坦克是右/左  x的范围 [enemyTank.getX(), enemyTank.getX() + 60]
                        //                     y的范围 [enemyTank.getY(), enemyTank.getY() + 40]
                        if (enemy.getDirect() == 1 || enemy.getDirect() == 3) {
                            //2. 当前坦克 左上角的坐标 [this.getX(), this.getY() ]
                            if (this.getX() >= enemy.getX()
                                    && this.getX() <= enemy.getX() + 60
                                    && this.getY() >= enemy.getY()
                                    && this.getY() <= enemy.getY() + 40) {
                                return true;
                            }
                            //3. 当前坦克 左下角的坐标 [this.getX(), this.getY() + 40]
                            if (this.getX() >= enemy.getX()
                                    && this.getX() <= enemy.getX() + 60
                                    && this.getY() + 40 >= enemy.getY()
                                    && this.getY() + 40 <= enemy.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
        }
        return false;

    }


    @Override
    public void run() {
        while (true) {
            //判断shots的size是否为0
            if (isLive && shots.size() < 1) {
                //判断坦克方向，发射子弹
                Shot s = null;
                switch (this.getDirect()) {
                    case 0:
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60, getY() + 20, 1);
                        break;

                    case 2:
                        s = new Shot(getX() + 20, getY() + 60, 2);
                        break;

                    case 3:
                        s = new Shot(getX(), getY() + 20, 3);
                        break;
                }
                shots.add(s);
                //启动子弹
                new Thread(s).start();
            }
            //根据坦克的方向来继续移动
            switch (this.getDirect()) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        //限制移动范围
                        if (getY() > 0 && !isTouchEnemyTank()) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000 && !isTouchEnemyTank()) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750 && !isTouchEnemyTank()) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0 && !isTouchEnemyTank()) {
                            moveLeft();
                        }
                        //休眠50ms
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
            //随机改变坦克的方向
            setDirect((int) (Math.random() * 4));

            //多线程一定要考虑什么时候结束
            if (!isLive) {
                break;//退出线程
            }
        }
    }
}

