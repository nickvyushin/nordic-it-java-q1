package com.filit.lesson6.classwork;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExample {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var array = new ArrayList<Integer>();

        for (var i = 0; i < 4; i++)
            array.add(sc.nextInt());

        System.out.println(array.get(0));

        array.set(2, 12);

        for (var elem : array)
            System.out.println(elem);
    }
}
