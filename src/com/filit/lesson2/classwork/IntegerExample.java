package com.filit.lesson2.classwork;

public class IntegerExample {
    public static void main(String[] args) {
        var a = Byte.valueOf((byte) 126);
        var b = Byte.valueOf((byte) 4);

        var c = 111_111_111_111L;

        var d = "9";
        // boxing
        var e = Integer.valueOf(Integer.parseInt(d));
        Integer ee = Integer.parseInt(d);
        Integer eee = 5;
        // unboxing
        System.out.println(eee.toString());

        var f = 0b1111;
        System.out.println(f);
        var g = "1111";
        System.out.println(Integer.parseInt(g, 2));
        var t = "aa";
        System.out.println(Integer.parseInt(t, 16));
        System.out.println(Integer.valueOf(t, 16));
        System.out.println(Integer.toString(170, 16));
//		System.out.println(Byte.valueOf((byte)(a+b)));
    }
}
