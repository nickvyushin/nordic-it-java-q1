package com.filit.lesson7.homework.com.zoo.animal;

import com.filit.lesson7.homework.com.zoo.exceptions.CantCatchFishException;

public class Bear extends Animal {

    public Bear(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }

    public Bear() {
    }

    public void catchFish() throws CantCatchFishException {
        throw new CantCatchFishException("Cant catch fish");
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
