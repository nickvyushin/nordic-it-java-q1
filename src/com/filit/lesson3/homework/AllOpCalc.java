package com.filit.lesson3.homework;

import java.util.Scanner;

public class AllOpCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите операцию: ");
        var op = sc.next();

        while (!op.equals("+") && !op.equals("-") && !op.equals("/") && !op.equals("*") && !op.equals("div") && !op.equals("mod") && !op.equals("^")) {
            System.out.println("Некорректная операция! Введите одну из доступных операций: ");
            op = sc.next();
        }

        System.out.println("Введите первое число: ");
        var num1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        var num2 = sc.nextInt();

        switch (op) {
            case "+":
                System.out.println("Результат сложения: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Результат вычитания: " + (num1 - num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("На ноль делить нельзя!");
                } else {
                    System.out.println("Результат деления: " + (num1 / num2));
                }
                break;
            case "*":
                System.out.println("Результат умножения: " + (num1 * num2));
                break;
            case "div":
                var div = num1 % num2;
                var res = (num1 - div) / num2;
                System.out.println("Результат целочисленного деления: " + res);
                break;
            case "mod":
                System.out.println("Остаток от деления: " + (num1 % num2));
                break;
            case "^":
                if (num1 == 0 && num2 < 0) {
                    System.out.println("Бесконечность");
                } else if (num2 < 0) {
                    var result = 1;
                    num2 = Math.abs(num2);
                    for (var i = 1; i <= num2; i++) {
                        result = result * num1;
                    }
                    System.out.println("Результат возведения в степень: " + (1 / result));
                } else {
                    var result = 1;
                    for (var i = 1; i <= num2; i++) {
                        result = result * num1;
                    }
                    System.out.println("Результат возведения в степень: " + result);
                }
                break;
        }
    }
}
