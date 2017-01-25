package ru.windwail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.windwail.entity.Game;

/**
 * Created by schukanov on 25.01.17.
 */
public class MainXml {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");


        Game g = context.getBean(Game.class);

        System.out.println(g);
    }
}
