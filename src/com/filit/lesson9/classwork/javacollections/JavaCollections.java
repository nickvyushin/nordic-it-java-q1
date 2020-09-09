package com.filit.lesson9.classwork.javacollections;

import java.util.HashSet;
import java.util.Scanner;

public class JavaCollections {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Введите слово для начала игры: ");
        var word = sc.nextLine();
        var currentPlayer = true;

        var letters = new HashSet<Character>();
        var wordsHistory1 = new HashSet<String>();
        var wordsHistory2 = new HashSet<String>();


        for (var i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
        }
        do {
            if (currentPlayer) {
                System.out.print("Игрок 1 вводит слово: ");
            } else {
                System.out.print("Игрок 2 вводит слово: ");
            }
            var newWord = sc.nextLine();

            if (!newWord.isBlank()) {
                if (check(newWord, letters)) {
                    if (!wordsHistory1.contains(newWord) && !wordsHistory2.contains(newWord)) {
                        if (currentPlayer) {
                            wordsHistory1.add(newWord);
                            System.out.println("Текущий счет игрока 1: " + wordsHistory1.size());
                        } else {
                            wordsHistory2.add(newWord);
                            System.out.println("Текущий счет игрока 2: " + wordsHistory2.size());
                        }
                    } else {
                        System.out.println("Слово использовалось ранее!");
                    }

                } else {
                    System.out.println("Ошибка! Введите новое слово!");
                }
            } else {
                System.out.println("Конец игры!");
                System.out.println("Счет игрока 1: " + wordsHistory1.size());
                System.out.println("Счет игрока 2: " + wordsHistory2.size());
                break;
            }
            currentPlayer = !currentPlayer;
        } while (true);

    }

    public static boolean check(String word, HashSet<Character> letters) {
        for (var i = 0; i < word.length(); i++) {
            if (!letters.contains(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
