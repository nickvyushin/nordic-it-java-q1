package com.filit.lesson9.classwork.javacollections;

public class ObjectExample {
    public static void main(String[] args) {
        var a = new String("a");
        var b = new String("a");
        var c = new String("a");

        System.out.println("a == b " + (a == b));
        System.out.println("a.equals(b) " + (a.equals(b)));
        System.out.println("a.equals(null) " + (a.equals(null)));
        System.out.println("a.equals(a) " + (a.equals(a))); // рефлективность
        System.out.println("a.equals(b) && b.equals(a) " + (a.equals(b) && b.equals(a))); // симметричность
        System.out.println("a.equals(c) && b.equals(b) && b.equals(c) " + (a.equals(c) && b.equals(b) && b.equals(c))); // транзитивность
    }
}
