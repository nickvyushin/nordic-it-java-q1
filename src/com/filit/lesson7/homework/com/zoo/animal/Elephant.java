package com.filit.lesson7.homework.com.zoo.animal;

public class Elephant extends Animal implements Sleepable {

    public Elephant(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }

    public Elephant() {
    }

    public void stomp() {
    }

    public void splash() {
    }

    @Override
    public void sleep() {

    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sounds='" + sounds + '\'' +
                ", speed=" + speed +
                '}';
    }
}
