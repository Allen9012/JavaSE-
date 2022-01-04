package com.ObjectMiddle.HomeworkChapter7;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Allen
 * Date: 2021-11-28
 * Time: 15:37
 */
public class Homework09 {
    public static void main(String[] args) {
        Music music = new Music("adfawf", 300);
        music.play();
        System.out.println(music.getInfo());
    }
}
class Music{
    String name;
    int times;
    public Music(String name,int times){
        this.name=name;
        this.times=times;
    }
    //播放
    public void play(){
        System.out.println("音乐"+name+"正在播放中时长为"+times+"秒");
    }
    public String getInfo(){
        return "音乐"+name+"时长"+times;
    }
}
