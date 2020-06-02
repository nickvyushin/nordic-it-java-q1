package com.filit.lesson7.homework.com.zoo.animal;

public class Monkey extends Animal {

    public Monkey(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }

    private String noise;
    private Boolean brash;

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public Boolean getBrash() {
        return brash;
    }

    public void setBrash(Boolean brash) {
        this.brash = brash;
    }
}
