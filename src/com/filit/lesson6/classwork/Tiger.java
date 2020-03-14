package com.filit.lesson6.classwork;

public class Tiger extends Animal {

    private String kind;

    public Tiger(String name, Integer age, String kind) {
        super(name, age);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void hungry() {
        System.out.println("Тигр голодный! Его надо покормить!");
    }

    public void getFood() {
        System.out.println("Даем тигру еду, а то он съест нас!");
    }


    @Override
    public void say() {
        System.out.println("Arrrrr");
    }

    @Override
    public void breathe() {
        System.out.println("huh-huh-huh");
    }
}
