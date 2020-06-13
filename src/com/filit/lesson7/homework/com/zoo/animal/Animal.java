package com.filit.lesson7.homework.com.zoo.animal;

public abstract class Animal implements Eatable, Reproducible, Runnable, Sleepable {

    protected String name;
    protected Integer age;
    protected String sounds;
    protected Integer speed;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sounds='" + sounds + '\'' +
                ", speed=" + speed +
                '}';
    }

    public Animal(String name, Integer age, String sounds, Integer speed) {
        this.name = name;
        this.age = age;
        this.sounds = sounds;
        this.speed = speed;
    }

    @Override
    public void eat() {
        System.out.println(name + " eat");
    }

    @Override
    public void reproduce() {
        System.out.println("Any animal can breed");
    }

    @Override
    public void run() {

    }

    @Override
    public void sleep() {

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
