package com.filit.lesson7.homework.com.zoo.animal;

import com.filit.lesson7.homework.com.zoo.exceptions.CantFightException;

public class Tiger extends Animal implements Runnable, Reproducible {

    public Tiger(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }

    public Tiger() {
    }

    public void wallow() {
    }

    public void fight() throws CantFightException {
        throw new CantFightException("Cant fight");
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

    @Override
    public void run() {

    }
}
