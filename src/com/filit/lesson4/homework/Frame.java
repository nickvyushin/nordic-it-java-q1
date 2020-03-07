package com.filit.lesson4.homework;

import java.util.Scanner;

public class Frame {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Введите ширину рамки: ");
        var width = sc.nextInt();
        System.out.println("Введите высоту рамки: ");
        var height = sc.nextInt();
        System.out.println("Введите текст: ");
        var text = sc.next();

        if (width <= text.length()) {
            System.out.println("Ширина рамки не позволяет вписать текст!");
        } else if (height <= 2) {
            System.out.println("Высота рамки не позволяет вписать текст!");
        } else {
            for (int i = 0; i < height; i++) {
                if (i == 0) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                } else if (i == height - 1) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                } else {
                    System.out.print("*");
                    for (int j = 0; j < (width - 2); j++) {
                            System.out.print(" ");
                    }
                    System.out.println("*");
                }
                /* if (j == 0) {
                    for (int i = 0; i < width; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                } else if (j == height - (height - 1)) {
                    for (int i = 0; i < height; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                } else if (j == height - (height - 2)) {
                    for (int i = 0; i < height; i++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }*/

            }
        }
    }
}
