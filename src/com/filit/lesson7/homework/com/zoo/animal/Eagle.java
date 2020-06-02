package com.filit.lesson7.homework.com.zoo.animal;

public class Eagle extends Animal {

    public Eagle(String name, Integer age, String sounds, Integer speed) {
        super(name, age, sounds, speed);
    }

    public Eagle() {
    }

    private Integer flightAltitude;
    private Integer wingspan;

    public Integer getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(Integer flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public Integer getWingspan() {
        return wingspan;
    }

    public void setWingspan(Integer wingspan) {
        this.wingspan = wingspan;
    }
}
