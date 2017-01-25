package ru.windwail.entity;


public class Game {
    private Team first;
    private Team second;

    private String city;
    private Integer score;

    public Game(Team first, Team second, String city, Integer score) {
        this.first = first;
        this.second = second;
        this.city = city;
        this.score = score;
    }

    public Game(Team first, Team second) {
        this.first = first;
        this.second = second;
    }

    public Team getFirst() {
        return first;
    }

    public void setFirst(Team first) {
        this.first = first;
    }

    public Team getSecond() {
        return second;
    }

    public void setSecond(Team second) {
        this.second = second;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ru.windwail.entity.Game{" +
                "first=" + first +
                ", second=" + second +
                ", city='" + city + '\'' +
                ", score=" + score +
                '}';
    }
}
