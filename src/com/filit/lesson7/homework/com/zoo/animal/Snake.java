package com.filit.lesson7.homework.com.zoo.animal;

public class Snake extends Animal implements Eatable {

    public Snake(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }

    public void rush() {
    }

    public void hide() {
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

    @Override
    public void eat() {

    }
}
