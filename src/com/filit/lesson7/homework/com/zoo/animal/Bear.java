package com.filit.lesson7.homework.com.zoo.animal;

public class Bear extends Animal {

    public Bear(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }

    public void catchFish() {
    }

    public void pickBerries() {
    }

    @Override
    public void eat() {
        System.out.println("Bear " + name + " eat");
    }

    @Override
    public String toString() {
        return "Bear{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sounds='" + sounds + '\'' +
                ", speed=" + speed +
                '}';
    }
}
