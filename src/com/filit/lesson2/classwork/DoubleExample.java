package com.filit.lesson2.classwork;

public class DoubleExample {

    public static void main(String[] args) {
        var a = 1.000_001f - 0.000_001f;
        var b = 1.0f;

        var delta = 1e-7;


        var d = 1.000_000d;

//		System.out.println(a - b);
//		System.out.println((a - b) < c);
//		System.out.println(c == d);
        System.out.println(Math.abs(a - b) < delta);
        System.out.println(Math.abs(a - b));
        System.out.println(delta);

        var result = true;
        System.out.println(!result);

        // 2^x = 10^y
        // |a - delta| < c

        System.out.println("");

        var firstNumber = 5.0;
        var secondNumber = 0;
        System.out.println(firstNumber / secondNumber);
    }


}
