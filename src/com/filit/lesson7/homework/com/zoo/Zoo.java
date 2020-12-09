package com.filit.lesson7.homework.com.zoo;

import com.filit.lesson7.homework.com.zoo.animal.*;
import com.filit.lesson7.homework.com.zoo.exceptions.AnimalAlreadyInAviaryException;
import com.filit.lesson7.homework.com.zoo.exceptions.AviaryExistsException;
import com.filit.lesson7.homework.com.zoo.exceptions.LimitException;

public class Zoo {
    public static void main(String[] args) throws AviaryExistsException, AnimalAlreadyInAviaryException, LimitException {

        Bear teddy = new Bear("Teddy", 4, "rrrr", 20);
        System.out.println(teddy);
        teddy.eat("ягоды");
        teddy.see(12);

        Eagle king = new Eagle("King", 5, "chach", 40);
        System.out.println(king);
        king.eat(40);
        king.see("дальнозоркое");

        Elephant boris = new Elephant("Boris", 10, "fufff", 15);
        System.out.println(boris);

        Lion leo = new Lion("Leo", 7, "arrrarr", 40);
        System.out.println(leo);
        leo.eat(12);

        Monkey sparky = new Monkey("Sparky", 2, "uhuahah", 25);
        System.out.println(sparky);
        sparky.climb();

        Snake helga = new Snake("Helga", 8, "shshshshs", 24);
        System.out.println(helga);
        helga.eat("кролика");

        Tiger sema = new Tiger("Sema", 11, "rarrr", 45);
        System.out.println(sema);
        sema.eat("вырезку");
        sema.reproduce();


        Bear maloy = new Bear();
        maloy.setName("Tom");
        System.out.println(maloy.getName());

        Aviaries aviaries = new Aviaries();
        Aviary av1 = new Aviary(10);

        aviaries.addAviaryInList(1, av1);
        av1.add(maloy);
        av1.add(helga);
        av1.add(sema);
        av1.add(helga);
    }
}
