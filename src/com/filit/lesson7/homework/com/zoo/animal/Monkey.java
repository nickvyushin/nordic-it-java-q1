package com.filit.lesson7.homework.com.zoo.animal;

public class Monkey extends Animal implements Reproducible{

    public Monkey(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }
    public void climb() {
        System.out.println("Dexterous monkey " + name + " climbing");
    }
    public void steal() {
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sounds='" + sounds + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void reproduce() {

    }
}
