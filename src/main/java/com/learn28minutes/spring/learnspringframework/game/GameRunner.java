package com.learn28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    //private MarioGame game;
    final GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
