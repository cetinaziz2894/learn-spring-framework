package com.learn28minutes.spring.learnspringframework;

import com.learn28minutes.spring.learnspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
        //MarioGame game = new MarioGame();
        //PackmanGame game = new PackmanGame();
        //SuperContraGame game = new SuperContraGame();
        //GameRunner runner = new GameRunner(game);
        GameRunner runner = context.getBean(GameRunner.class);
        runner.run();
    }

}
