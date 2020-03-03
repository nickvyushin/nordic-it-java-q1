package com.filit.lesson1.classwork;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Очень крутой код и сложный
        /* Привет
         * как дела?
         * Меня зовут Вася
         */
        var scanner = new Scanner(System.in);

        var message = "Hello!";
        var age = scanner.nextInt();
        System.out.println("Всем привет, меня зовут Вася");
        System.out.println(message);
        System.out.println(age + 5);
        System.out.println(age - 10);
//		+, -, *, /, /, %
    }
}
