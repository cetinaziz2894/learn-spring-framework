package com.learn28minutes.spring.learnspringframework.game;

public class PackmanGame implements GamingConsole{
    public void up(){
        System.out.println("Packman Game Jump");
    }
    public void down(){
        System.out.println("Packman Game down into a hole");
    }
    public void right(){
        System.out.println("Packman Game accelerate");
    }
    public void left(){
        System.out.println("Packman Game stop");
    }
}
