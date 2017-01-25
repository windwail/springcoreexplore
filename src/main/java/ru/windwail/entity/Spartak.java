package ru.windwail.entity;

import org.springframework.stereotype.Component;

@Component
public class Spartak implements Team {
    public String getName() {
        return "Spartak";
    }
}
