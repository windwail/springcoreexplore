package ru.windwail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.windwail.entity.Dynamo;
import ru.windwail.entity.Game;
import ru.windwail.entity.Spartak;
import ru.windwail.entity.Team;

import java.util.List;

/**
 * Created by schukanov on 24.01.17.
 */
@Configuration
@ComponentScan
public class AppConfig {

    @Autowired
    public List<Team> teams;

    @Bean
    Game game() {
        return new Game(teams.get(0), teams.get(1));
    }


}
