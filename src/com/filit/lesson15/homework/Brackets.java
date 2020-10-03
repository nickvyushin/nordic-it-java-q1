package com.filit.lesson15.homework;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Введите последовательность: ");
        var brackets = sc.nextLine();

        char[] bracketsArray = brackets.toCharArray();
        if (check(bracketsArray)) {
            System.out.println("Правильная последовательность!");
        } else {
            System.out.println("Последовательность неправильная!");
        }
    }

    public static boolean check(char[] c) {
        var bracketsDequeue = new ArrayDeque<Character>();
        for (char bracket : c) {
            if (bracket == '{' || bracket == '[') {
                bracketsDequeue.add(bracket);
            } else {
                if (bracketsDequeue.isEmpty()) {
                    return false;
                } else {
                    Character top = bracketsDequeue.peekLast();
                    if ((top == '{' && bracket == '}') || (top == '[' && bracket == ']')) {
                        bracketsDequeue.pollLast();
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
