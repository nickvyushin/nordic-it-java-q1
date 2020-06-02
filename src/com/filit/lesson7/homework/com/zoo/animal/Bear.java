package com.filit.lesson7.homework.com.zoo.animal;

public class Bear  extends Animal {

    private String catchFish;
    private String pickBerries;

    public Bear(String name, Integer age, String sounds, Integer speed, String catchFish, String pickBerries) {
        super(name, age, sounds, speed);
        this.catchFish = catchFish;
        this.pickBerries = pickBerries;
    }

    public Bear() {
    }

    public String getCatchFish() {
        return catchFish;
    }

    public void setCatchFish(String catchFish) {
        this.catchFish = catchFish;
    }

    public String getPickBerries() {
        return pickBerries;
    }

    public void setPickBerries(String pickBerries) {
        this.pickBerries = pickBerries;
    }
}
