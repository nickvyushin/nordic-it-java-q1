package com.filit.lesson4.classwork;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var n = scanner.nextInt();
        if (n > 12) {
            System.out.println("Ввели слишком большое число");
        }
        else if (n < 0) {
            System.out.println("Факториал для отрицательного числа не определен");
        }
        else {
            var result = 1;
            for (var i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println(n + "! = " + result);
        }

    }
}
