package com.filit.lesson7.homework.com.zoo.animal;

public class Eagle extends Animal {

    public Eagle(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }

    public Eagle() {
    }

    public void fly() {
    }

    public void catchMouse() {
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sounds='" + sounds + '\'' +
                ", speed=" + speed +
                '}';
    }
}
