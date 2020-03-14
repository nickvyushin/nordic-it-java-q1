package com.filit.lesson6.classwork;

import java.util.Scanner;

public class Zoo {

    private static final int MAX_AGE = 5;

    public static void main(String[] args) {

        var cat = new Cat("Джулия", MAX_AGE, false);
        var cat2 = new Cat("Гав", 3, false);
        Cat cat3 = null;//new Cat("Мурзик", 5, false);
        var cat4 = new Cat("Брэд", 5, false);
        var tiger1 = new Tiger("Матильда", 10, "Бенгальский");


        cat2.jump(2);
        cat2.eat(40);


/*
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

        var sc = new Scanner(System.in);

        System.out.println("Как зовут тигра?");
        tiger1.setName(sc.nextLine());
        System.out.println("Сколько ему лет?");
        tiger1.setAge(sc.nextInt());
        System.out.println("Какого он вида?");
        tiger1.setKind(sc.nextLine());

        var animal = new Animal("Мурзик", 4);
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
*/


  //      System.out.println((double) Cat.countAge / Cat.count);

   //     System.out.println(Cat.say(cat2.getName()));
    }
}
