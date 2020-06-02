package com.filit.lesson7.homework.com.zoo.animal;

public class Elephant extends Animal {

    public Elephant(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }

    private Integer weight;
    private Boolean bigEars;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getBigEars() {
        return bigEars;
    }

    public void setBigEars(Boolean bigEars) {
        this.bigEars = bigEars;
    }
}
