package com.filit.lesson7.homework.com.zoo.animal;

public class Animal implements Eatable {

    protected String name;
    protected Integer age;
    protected String sounds;
    protected Integer speed;

    public void see(Integer range) {
        System.out.println("Дальность зрения животного: " + range);
    }

    public void see(String whatVision) {
        System.out.println("Это животное: " + whatVision);
    }

    public void breath() {
        System.out.println("Все животные могут дышать.");
    }

    @Override
    public void eat(Integer amount) {
        System.out.println("Животному дали еды в количестве: " + amount);
    }

    @Override
    public void eat(String kindOfFood) {
        System.out.println("Животному дали: " + kindOfFood);
    }

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
