package com.filit.lesson7.homework.com.zoo.animal;

public class Lion extends Animal {

    public Lion(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }

    public void rule() {
    }
    public void grin() {
    }

    @Override
    public void eat() {
        System.out.println("Lion " + name + " eat");
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sounds='" + sounds + '\'' +
                ", speed=" + speed +
                '}';
    }
}
