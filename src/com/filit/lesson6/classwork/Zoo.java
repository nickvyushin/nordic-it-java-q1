package com.filit.lesson6.classwork;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        var cat = new Cat();
        var cat2 = new Cat();
        var cat3 = new Cat();
        var cat4 = new Cat();

        cat3.setName("Мурзик");
        cat3.setAge(5);
        System.out.print(cat3.getName() + ":");
        cat3.say();
        System.out.print("Ему: " + cat3.getAge() + ". Его ");
        cat3.drinkMilk();

        cat2.setName("Гав");
        cat2.setAge(2);
        System.out.print(cat2.getName() + ":");
        cat2.say();
        System.out.print("Ему: " + cat2.getAge() + ". Он ");
        cat2.hungry();

        var tiger1 = new Tiger();
        var sc = new Scanner(System.in);

        System.out.println("Как зовут тигра?");
        tiger1.setName(sc.nextLine());
        System.out.println("Сколько ему лет?");
        tiger1.setAge(sc.nextInt());
        System.out.println("Какого он вида?");
        tiger1.setKind(sc.nextLine());

    }
}
