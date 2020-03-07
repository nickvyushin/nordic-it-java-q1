package com.filit.lesson5.classwork;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();

        System.out.println(fibonacciNumber(n));
    }

    // fibonacci == f
    // fibonacciNumber(n) = fibonacciNumber(n-1) + fibonacciNumber(n-2)
    // fibonacciNumber(0) = 0
    // fibonacciNumber(1) = 1


    // n! = 1*2*3*..n
    // (n-1)! = 1 * 2 * 3 ... * (n-1)
    // fact(n) = fact(n-1) * n;

    public static int fibonacciNumber(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

}
