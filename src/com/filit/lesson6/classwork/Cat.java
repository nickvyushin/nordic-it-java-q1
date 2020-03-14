package com.filit.lesson6.classwork;

public class Cat extends Animal implements Jumpable, Eateble {

    public static int count;
    public static int countAge;

    public Cat() {
        super(null,0);
    }

    public Cat(String name, int age, boolean isHungry) {
        super(name, age);
        this.isHungry = isHungry;
        count += 1;
        countAge += age;
    }

    private Integer age;
    private boolean isHungry;

    public void say() {
        System.out.println("Meow!");
    }

    @Override
    public void breathe() {
        System.out.println("huh-huh-huh");
    }

    public static String say(String name) {
        return name + ":meow";
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

    @Override
    public void jump(float meters) {
        System.out.println("Пригнуло на " + meters + " метров");
    }

    @Override
    public void eat(float grammes) {
        System.out.println("Насыпали " + grammes + " корма");
    }
}
