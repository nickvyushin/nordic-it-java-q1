package com.filit.lesson7.homework.com.zoo;

import com.filit.lesson7.homework.com.zoo.animal.*;

public class Zoo {
    public static void main(String[] args) {

        Bear teddy = new Bear("Teddy", 4, "rrrr", 20);
        System.out.println(teddy);
        teddy.eat();

        Eagle king = new Eagle("King", 5, "chach", 40);
        System.out.println(king);
        king.eat();

        Elephant boris = new Elephant("Boris", 10, "fufff", 15);
        System.out.println(boris);
        boris.eat();

        Lion leo = new Lion("Leo", 7, "arrrarr", 40);
        System.out.println(leo);
        leo.eat();

        Monkey sparky = new Monkey("Sparky", 2, "uhuahah", 25);
        System.out.println(sparky);
        sparky.eat();
        sparky.climb();

        Snake helga = new Snake("Helga", 8, "shshshshs", 24);
        System.out.println(helga);
        helga.eat();

        Tiger sema = new Tiger("Sema", 11, "rarrr", 45);
        System.out.println(sema);
        sema.eat();
        sema.reproduce();


    }
}
