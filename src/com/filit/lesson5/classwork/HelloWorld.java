package com.filit.lesson5.classwork;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var n = scanner.nextInt();
        var res = sumEvenNumbers(n);

        System.out.println(res);

    }

    private static int sumNumbers(int n, int start, int step) {
        var result = 0;

        for (int i = start;i < n;i+=step) {
            result += i;
        }
        return result;
    }

    private static int sumEvenNumbers(int nnn) {
        return sumEvenNumbers(-1);
    }

    private static int sumOddNumbers(int nnn) {
        return sumNumbers(nnn, 1, 2);
    }
}
