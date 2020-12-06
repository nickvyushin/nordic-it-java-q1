package com.filit.lesson7.homework.com.zoo;

import com.filit.lesson7.homework.com.zoo.animal.*;
import com.filit.lesson7.homework.com.zoo.exceptions.*;

public class Zoo {
    public static void main(String[] args) {

        try {
            Bear teddy = new Bear("Teddy", 4, "rrrr", 20);
            /*System.out.println(teddy);
            teddy.eat();*/

            Eagle king = new Eagle("King", 5, "chach", 40);
            /*System.out.println(king);
            king.eat();*/

            Elephant boris = new Elephant("Boris", 10, "fufff", 15);
            /*System.out.println(boris);
            boris.eat();*/

            Lion leo = new Lion("Leo", 7, "arrrarr", 40);
            /*System.out.println(leo);
            leo.eat();*/

            Monkey sparky = new Monkey("Sparky", 2, "uhuahah", 25);
            /*System.out.println(sparky);
            sparky.eat();
            sparky.climb();*/

            Snake helga = new Snake("Helga", 8, "shshshshs", 24);
            /*System.out.println(helga);
            helga.eat();*/

            Tiger sema = new Tiger("Sema", 11, "rarrr", 45);
            /*System.out.println(sema);
            sema.eat();
            sema.reproduce();*/


            Bear maloy = new Bear();
            /*maloy.setName("Tom");
            System.out.println(maloy.getName());*/

            Aviaries aviaries = new Aviaries();


            aviaries.create(1, new Aviary(5));
            aviaries.create(2, new Aviary(5));
            aviaries.create(3, new Aviary(5));

            aviaries.add(1, teddy);
            aviaries.add(1, king);
            aviaries.add(1, boris);
            aviaries.add(1, leo);
            aviaries.add(1, sparky);
            aviaries.add(1, helga);
            // aviaries.add(4, sema);


            maloy.catchFish();
            sema.fight();

        } catch (CantCatchFishException | CantFightException | AnimalAlreadyInAviaryException | LimitException | AviaryNotFoundException e) {
            System.out.println("New exception: " + e.getMessage());
        }
    }
}
