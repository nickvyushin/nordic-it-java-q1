package com.filit.lesson7.homework.com.zoo.animal;

public class Animal {

    protected String name;
    protected Integer age;
    protected String sounds;
    protected Integer speed;

    public Animal(String name, Integer age, String sounds, Integer speed) {
        this.name = name;
        this.age = age;
        this.sounds = sounds;
        this.speed = speed;
    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSounds() {
        return sounds;
    }

    public void setSounds(String sounds) {
        this.sounds = sounds;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
