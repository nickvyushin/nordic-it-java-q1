package com.filit.lesson7.homework.com.zoo;

import com.filit.lesson7.homework.com.zoo.animal.Bear;

public class Zoo {
    public static void main(String[] args) {
        Bear bear = new Bear("Мишутка", 5, "ARRR", 20, "Лосось", "Брусника");
        System.out.println("Медвежонок по имени " + bear.getName() + ", в возрасте " + bear.getAge() + " лет издает рык: "
        + bear.getSounds() + ", бегает со скоростью " + bear.getSpeed() + " ест рыбу " + bear.getCatchFish()
                + " и собирает ягоду " + bear.getPickBerries() + ".");
    }
}
