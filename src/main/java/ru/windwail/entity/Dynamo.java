package ru.windwail.entity;

import org.springframework.stereotype.Component;

@Component
public class Dynamo implements Team {
    public String getName() {
        return "Dynamo";
    }
}
