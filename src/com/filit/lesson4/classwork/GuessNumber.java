package com.filit.lesson4.classwork;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Введи число от 0 до 9");

        var randomNumber = new Random().nextInt(10);

        var inputNumber = scanner.nextInt();
        var count = 1;

        while (inputNumber != randomNumber) {
            if (randomNumber > inputNumber) {
                System.out.println("Больше");
            }
            else {
                System.out.println("Меньше");
            }
            inputNumber = scanner.nextInt();
            count += 1;
        }

        System.out.println("Ты угадал число, с " + count + " раз");
    }
}
