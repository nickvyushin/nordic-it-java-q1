package com.filit.lesson7.homework.com.zoo.animal;

public class Tiger extends Animal {

    public Tiger(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }
    public void wallow() {
    }
    public void fight() {
    }

    @Override
    public void eat() {
        System.out.println("Tiger " + name + " eat");
    }

    @Override
    public void reproduce() {
        System.out.println("Tiger " + name + " reproduced");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sounds='" + sounds + '\'' +
                ", speed=" + speed +
                '}';
    }
}
