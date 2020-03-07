package com.filit.lesson6.classwork;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExercise {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var numList = new ArrayList<Integer>();
        System.out.println("Введите количество элементов: ");
        var n = sc.nextInt();

        System.out.println("Введите числа в список: ");
        for (var i = 0; i < n; i++)
            numList.add(sc.nextInt());
        var sum = 0;
        for (var elem : numList)
            sum = sum + elem;
        System.out.println("Среднее арифметическое: " + ((double) sum / n));

        var max = numList.get(0);
        var min = numList.get(0);
        for (var elem : numList)
            if (elem > max) {
                max = elem;
            } else if (elem < min) {
                min = elem;
            }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }
}
