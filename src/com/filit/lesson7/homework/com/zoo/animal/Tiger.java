package com.filit.lesson7.homework.com.zoo.animal;

public class Tiger extends Animal {

    public Tiger(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }

    private Integer numberOfStrips;
    private String color;

    public Integer getNumberOfStrips() {
        return numberOfStrips;
    }

    public void setNumberOfStrips(Integer numberOfStrips) {
        this.numberOfStrips = numberOfStrips;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
