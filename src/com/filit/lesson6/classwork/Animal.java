package com.filit.lesson6.classwork;

public abstract class Animal {

    protected String name;
    protected Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void say();
    public abstract void breathe();



}
