package com.TankGame05;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-01-31
 * Time: 13:46
 */

//为了让panel不停的重绘，需要将MyPanel实现Runnable接口
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //define my tank

    Hero hero = null;
    //定义敌人放到vector
    int enemySize = 3;
    Vector<Enemy> enemies = new Vector<>();
    //定义一个存放Node 对象的Vector, 用于恢复敌人坦克的坐标和方向
    Vector<Node> nodes = null;
    //放炸弹到数组里面
    Vector<Bomb> bombs = new Vector<>();
    Image image1 ;
    Image image2 ;
    Image image3 ;

    public MyPanel(String key) {//构造器
        nodes = Recorder.getNodesAndEnemyTankRec();
        //将MyPanel对象的 enemyTanks 设置给 Recorder 的 enemyTanks
        Recorder.setEnemies(enemies);
        hero = new Hero(800, 100);
        hero.setSpeed(3);//快一点
        switch (key) {
            case "1":
                Recorder.setAllEnemyTankNum(0);
                //初始化敌人坦克
                for (int i = 0; i < enemySize; i++) {
                    //创建一个敌人的坦克
                    Enemy enemy = new Enemy((100 * (i + 1)), 0);
                    //将enemies设置给 enemy !!!,从而让坦克遍历不要穿模
                    enemy.setEnemies(enemies);
                    //设置方向
                    enemy.setDirect(2);
                    //启动敌人坦克线程，让他动起来
                    new Thread(enemy).start();
                    //给该enemyTank 加入一颗子弹
                    Shot shot = new Shot(enemy.getX() + 20, enemy.getY() + 60, enemy.getDirect());
                    //加入enemyTank的Vector 成员
                    enemy.shots.add(shot);
                    //启动 shot 对象
                    new Thread(shot).start();
                    //加入
                    enemies.add(enemy);
                }
                break;
            case "2": //继续上局游戏
                //初始化敌人坦克
                for (int i = 0; i < nodes.size(); i++) {
                    Node node = nodes.get(i);
                    //创建一个敌人的坦克
                    Enemy enemy = new Enemy(node.getX(), node.getY());
                    //将enemyTanks 设置给 enemy !!!
                    enemy.setEnemies(enemies);
                    //设置方向
                    enemy.setDirect(node.getDirect());
                    //启动敌人坦克线程，让他动起来
                    new Thread(enemy).start();
                    //给该enemyTank 加入一颗子弹
                    Shot shot = new Shot(enemy.getX() + 20, enemy.getY() + 60, enemy.getDirect());
                    //加入enemyTank的Vector 成员
                    enemy.shots.add(shot);
                    //启动 shot 对象
                    new Thread(shot).start();
                    //加入
                    enemies.add(enemy);
                }
                break;
            default:
                System.out.println("你的输入有误...");
        }

        //放入照片
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));

    }

    public void hitEnemyTank() {
        for (int j = 0; j < hero.shots.size(); j++) {
            //要打多个子弹放到Vector遍历
            Shot shot = hero.shots.get(j);
            //第一次进            后面几次进循环
            if (shot != null && shot.isLive) {//当我的子弹还是存活的，只能打一个
                //遍历tank
                for (int i = 0; i < enemies.size(); i++) {
                    Enemy enemy = enemies.get(i);
                    hitTank(shot, enemy);
                }
            }
        }

    }

//编写方法，判断敌人坦克是否击中我的坦克
    public void hitHero(){
        for (int i = 0; i < enemies.size(); i++) {
            Enemy enemy = enemies.get(i);
            //遍历enemy对象的所有子弹
            for (int j = 0; j <enemy.shots.size() ; j++) {
                Shot shot = enemy.shots.get(j);
                if(hero.isLive && shot.isLive){
                    hitTank(shot,hero);
                }
            }
        }
    }
    //static
    //这里要改成Tank类型的参数，但是由于参数名一改要全改
    public void hitTank(Shot s, Tank enemy) {
//判断是否击中坦克，只需要判断是否在坦克的区域内
        switch (enemy.getDirect()) {
            case 0://向上
            case 2://向下
                if (s.x > enemy.getX() && s.x < enemy.getX() + 40
                        && s.y > enemy.getY() && s.y < enemy.getY() + 60) {
                    s.isLive = false;
                    enemy.isLive = false;
                    //把坦克的移除放到这里来，不要放到paint方法中
                    enemies.remove(enemy);

                    //击中一个敌方坦克就++
                    //enemyTank可以是Hero，也可以是enemy
                    if(enemy instanceof Enemy){
                        Recorder.addAllEnemyTank();
                    }

                    //放入炸弹集合
                    Bomb bomb = new Bomb(enemy.getX(), enemy.getY());
                    bombs.add(bomb);
                }
                break;
            case 1://向右
                //等号自己酌情,会感觉还有一点距离就没了
            case 3://向左
                if (s.x > enemy.getX() && s.x < enemy.getX() + 60
                        && s.y > enemy.getY() && s.y < enemy.getY() + 40) {
                    s.isLive = false;
                    enemy.isLive = false;
                    enemies.remove(enemy);

                    if(enemy instanceof Enemy){
                        Recorder.addAllEnemyTank();
                    }

                    Bomb bomb = new Bomb(enemy.getX(), enemy.getY());
                    bombs.add(bomb);
                }
                break;
        }

    }

    public void showInfo(Graphics g) {
        g.setColor(Color.BLACK);
        Font font = new Font("宋体",Font.BOLD,25);
        g.setFont(font);
        g.drawString("您累计击毁坦克数",1020,30);
        //drawback
        drawTank(1020,60,g,0,0);//画一个敌方坦克
        g.setColor(Color.BLACK);//需要设置成黑色,不然字体青色
        g.drawString(Recorder.getAllEnemyTankNum()+"",1080,100);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        showInfo(g);
        //画出自己的坦克
        if(hero!=null && hero.isLive){
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        }

//        //画出hero射出的子弹,但是这里还是一颗子弹所以已经不行了
//        if (hero.shot != null && hero.shot.isLive == true) {
//            //g.fill3DRect(hero.shot.x,hero.shot.y,1,1,false);
//            System.out.println("子弹被绘制...");
//            g.draw3DRect(hero.shot.x, hero.shot.y, 2, 2, false);
//        }
//        if (hero.shot != null && hero.shot.isLive == true) {
//            g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
//        }

        //将hero子弹集合shots,遍历取出来绘制
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isLive) {
                g.draw3DRect(shot.x, shot.y, 2, 2, false);
            } else {//如果已经无效，就拿掉
                hero.shots.remove(shot);
            }
        }

        //敌人坦克多，而且多线程，所以要放到Vector中
        ////画出敌人坦克的子弹
        for (int i = 0; i < enemies.size(); i++) {
            //取出坦克
            Enemy enemy = enemies.get(i);
            //判断坦克是否存活
            if (enemy.isLive) {//坦克活着再去画
                drawTank(enemy.getX(), enemy.getY(), g, enemy.getDirect(), 0);
                //取出子弹
                for (int j = 0; j < enemy.shots.size(); j++) {
                    Shot shot = enemy.shots.get(j);
                    //绘制
                    if (shot.isLive) {
                        g.draw3DRect(shot.x, shot.y, 2, 2, false);
                    } else {
                        //从Vector移除
                        enemy.shots.remove(shot);
                    }
                }
            }
        }


        //画炸弹
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            }
            bomb.lifeDown();
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

    }

    /**
     * @param x      坦克的左上角坐标
     * @param y      坦克的左上角坐标
     * @param g      画笔
     * @param direct 坦克方向
     * @param type   坦克类型
     */
    //要保证坦克的方向
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0: //enemy
                g.setColor(Color.cyan);
                break;
            case 1:  //my
                g.setColor(Color.yellow);
                break;

        }
        //跟据方向绘制坦克
        //direct表示方向(0上1向右2向左3向下)
        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
                System.out.println("暂时没处理");
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


    //处理事件
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            //改变坦克的方向
            //还要修改坦克坐标
            hero.setDirect(0);
            //控制移动范围
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            if (hero.getY() + 60 < 750) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_J) {
            System.out.println("J is pressed");
//            //启动线程之后会进入该方法

            //发射多颗子弹
            hero.shotEnemyTank();

        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    //子弹要看到要一直重绘这个panel才可以
    @Override
    public void run() {//每隔100ms要重绘区域
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //判断是否击中敌人
            //没有按j没子弹所以是防止空
            //改成多个子弹，遍历子弹
            //换到hitEnemyTank里面
            //直接写成方法，不要全堆在run里面
            //判断敌人打我们
            hitEnemyTank();
            //判断我们打敌人
            hitHero();
            this.repaint();
        }
    }
}

