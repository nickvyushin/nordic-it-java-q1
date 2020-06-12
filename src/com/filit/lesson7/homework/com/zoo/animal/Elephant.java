package com.filit.lesson7.homework.com.zoo.animal;

public class Elephant extends Animal {

    public Elephant(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }
    public void stomp() {
    }
    public void splash() {
    }

    @Override
    public void eat() {
        System.out.println("Elephant " + name + " eat");
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
