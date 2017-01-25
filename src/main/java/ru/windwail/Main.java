package ru.windwail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.windwail.entity.Game;
import ru.windwail.entity.Team;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by schukanov on 24.01.17.
 */
public class Main {

    final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Game g = context.getBean(Game.class);

        System.out.println(g);

        logger.debug("WWWWWWWAAAA!");

        AppConfig appConfig = context.getBean("appConfig",AppConfig.class);

        System.out.println("Listing all -----------------------");
        for(Team t: appConfig.teams) {
            System.out.println(t.getName());
        }

        System.out.println(context.getBeanDefinitionCount());

        for(String bd: context.getBeanDefinitionNames()) {
            System.out.println(bd);
        }


    }
}
