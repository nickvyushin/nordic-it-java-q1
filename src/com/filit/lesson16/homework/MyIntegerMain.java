package com.filit.lesson16.homework;

import java.util.ArrayList;
import java.util.TreeSet;

class MyIntegerMain {

    public static void main(String[] args) {

//Создать класс целых чисел MyInteger с порядком на основе количества простых делителей.
//Покажите на примере 4 - 5 чисел.

        System.out.println("Задание 1: ");

        var task1 = new TreeSet<MyInteger>();
        task1.add(new MyInteger(150));
        task1.add(new MyInteger(153));
        task1.add(new MyInteger(876));
        task1.add(new MyInteger(74));
        task1.add(new MyInteger(580));
        System.out.println("Результат: ");
        for (MyInteger n : task1) {
            System.out.println(n.getNumber() + " ");
        }

//Создать класс целых чисел MyInteger с итератором по цифрам десятичного представления чисел.
//Покажите на примере 4-5 чисел. Используйте конструкцию for-each.

        System.out.println("Задание 2: ");

        var task2 = new ArrayList<MyIntegerIterator>();
        task2.add(new MyIntegerIterator(123));
        task2.add(new MyIntegerIterator(17386));
        task2.add(new MyIntegerIterator(86));
        task2.add(new MyIntegerIterator(2048));
        task2.add(new MyIntegerIterator(957435678));

        System.out.println("Результат: ");
        for (MyIntegerIterator elem : task2) {
            for (String num : elem) {
                System.out.println(elem.getNumber() + " -> " + num);
            }
        }
    }
}