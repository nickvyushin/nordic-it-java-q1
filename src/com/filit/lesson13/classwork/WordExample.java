package com.filit.lesson13.classwork;

import java.util.ArrayList;
import java.util.Scanner;

public class WordExample {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        var sentence = sc.nextLine();

        String[] words = sentence.split("\\s");

        var arrayList = new ArrayList<Word>();

        for (String word : words) {
 //           arrayList.add(word);
        }
    }
}
