package com.filit.lesson7.homework.com.zoo.animal;

public class Snake extends Animal {

    public Snake(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }

    private Integer howLong;
    private String howVenomous;

    public Integer getHowLong() {
        return howLong;
    }

    public void setHowLong(Integer howLong) {
        this.howLong = howLong;
    }

    public String getHowVenomous() {
        return howVenomous;
    }

    public void setHowVenomous(String howVenomous) {
        this.howVenomous = howVenomous;
    }
}
