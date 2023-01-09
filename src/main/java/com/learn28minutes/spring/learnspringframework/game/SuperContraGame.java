package com.learn28minutes.spring.learnspringframework.game;

public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("super contra game jump");
    }
    public void down(){
        System.out.println("super contra game down into a hole");
    }
    public void right(){
        System.out.println("super contra game accelerate");
    }
    public void left(){
        System.out.println("super contra game stop");
    }
}
