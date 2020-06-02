package com.filit.lesson9.classwork.javacollections;

import java.util.HashSet;
import java.util.Scanner;

public class JavaCollections {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Введите слово для начала игры: ");
        var word = sc.nextLine();

        var letters = new HashSet<Character>();
        var wordsHistory = new HashSet<Character>();

        for (var i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
        }
        System.out.println("Введите слово: ");
        var newWord = sc.nextLine();

        for (var i = 0; i < newWord.length(); i++) {
            if (!letters.contains(newWord.charAt(i))) {
                System.out.println("Ошибка! Введите новое слово!");
                break;
            } else {
                wordsHistory.add(newWord.charAt(i));
            }
            newWord = sc.nextLine();
        }
    }
}
