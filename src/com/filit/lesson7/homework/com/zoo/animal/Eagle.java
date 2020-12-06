package com.filit.lesson7.homework.com.zoo.animal;

public class Eagle extends Animal implements Eatable {

    public Eagle(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }



    public void fly() {
    }

    public void catchMouse() {
    }

    @Override
    public void eat() {
        System.out.println("Eagle " + name + " eat");
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
