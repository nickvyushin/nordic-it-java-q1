package com.filit.lesson7.homework.com.zoo.animal;

public class Snake extends Animal {

    public Snake(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }
    public void rush() {
    }
    public void hide() {
    }

    @Override
    public void eat() {
        System.out.println("Snake " + name + " eat");
    }

    @Override
    public String toString() {
        return "Snake{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sounds='" + sounds + '\'' +
                ", speed=" + speed +
                '}';
    }
}
