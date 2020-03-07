package com.filit.lesson6.classwork;

public class Cat extends Animal {

    private Integer age;

    public void say() {
        System.out.println("Meow!");
    }

    public void drinkMilk() {
        System.out.println("напоили молоком.");
    }

    public void hungry() {
        System.out.println("голодный!");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
