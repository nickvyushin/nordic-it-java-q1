package com.filit.lesson13.classwork;

public class BoxExample {

    public static void change(Box box) {
        box.setData(false);
    }

    public static void main(String[] args) {
        var box = new Box<Integer>(5);
        System.out.println(box.getData() + 10);
    }
}
