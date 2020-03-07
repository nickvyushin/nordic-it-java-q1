package com.filit.lesson6.classwork;

public class Tiger extends Animal {

    private String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

    public void hungry() {
        System.out.println("Тигр голодный! Его надо покормить!");
    }

    public void getFood() {
        System.out.println("Даем тигру еду, а то он съест нас!");
    }

}
