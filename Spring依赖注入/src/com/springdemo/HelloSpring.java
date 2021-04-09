package com.springdemo;

/**
 * @Author hsh
 * @Date 15:39 2021/4/8
 * @Param 
 * @return 
 * @Description //TODO 
 **/
public class HelloSpring {
    /**
     * @Author hsh
     * @Date 15:56 2021/4/8
     * @Param 
     * @return
     * @Description //TODO 
     **/
    private String who = null;

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public void print(){
        System.out.println(getWho());
        System.out.println("Rod说：世界上有10种人，认识二进制的和不认识二进制的。");
    }
}
