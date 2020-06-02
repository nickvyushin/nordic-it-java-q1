package com.filit.lesson7.homework.com.zoo.animal;

public class Lion extends Animal {

    public Lion(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }

    private Boolean isKing;
    private Integer heirs;

    public Boolean getKing() {
        return isKing;
    }

    public void setKing(Boolean king) {
        isKing = king;
    }

    public Integer getHeirs() {
        return heirs;
    }

    public void setHeirs(Integer heirs) {
        this.heirs = heirs;
    }
}
