package com.TankGame05;

import java.io.*;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2022-03-10
 * Time: 21:54
 */
public class Recorder {
 //定义变量，记录我方敌人坦克数
    private static int  allEnemyTankNum=0;
    private static BufferedWriter bw=null;
    private static BufferedReader br = null;
    private static String recordFile="e:\\Record.txt";
    private static Vector<Enemy> enemies=null;
private static Vector<Node> nodes=new Vector<>();
    public static void setEnemies(Vector<Enemy> enemies) {
        Recorder.enemies = enemies;
    }
    public static String getRecordFile() {
        return recordFile;
    }

    //增加一个方法，用于读取recordFile, 恢复相关信息
    //该方法，在继续上局的时候调用即可
    public static Vector<Node> getNodesAndEnemyTankRec() {

        try {
            br = new BufferedReader(new FileReader(recordFile));
            //击毁的坦克数,把string读成int
            allEnemyTankNum = Integer.parseInt(br.readLine());
            //循环读取文件，生成nodes 集合
            String line = "";//255 40 0
            while ((line = br.readLine()) != null) {
                String[] xyd = line.split(" ");
                Node node = new Node(Integer.parseInt(xyd[0]),
                        Integer.parseInt(xyd[1]),
                        Integer.parseInt(xyd[2]));
                nodes.add(node);//放入nodes Vector
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return nodes;
    }


    //增加一个方法，当游戏退出时，我们将allEnemyTankNum 保存到 recordFile
    //对keepRecord 进行升级, 保存敌人坦克的坐标和方向
    public static void keepRecord() {
        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter(recordFile));
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum+"\r\n");
            //遍历敌人坦克的Vector ,然后根据情况保存即可.
            //OOP, 定义一个属性 ，然后通过setXxx得到 敌人坦克的Vector
            for (int i = 0; i <enemies.size() ; i++) {
                Enemy enemy = enemies.get(i);
                if (enemy.isLive) { //建议判断.
                    //保存该enemyTank信息
                    String record = enemy.getX() + " " + enemy.getY() + " " + enemy.getDirect();
                    //写入到文件
                    bw.write(record + "\r\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //if(bw!=null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    //但我反坦克击毁敌人坦克，应当 allEnemyTankNum++
    public  static void addAllEnemyTank(){
        Recorder.allEnemyTankNum++;
    }
}
