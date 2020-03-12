package com.filit.lesson6.homework;

import java.util.Scanner;

public class SameValues {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        var n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            var elem = numbers[i];
            System.out.print(elem);
        }
    }
}
