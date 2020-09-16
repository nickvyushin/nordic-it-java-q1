package com.filit.lesson17.classwork;

import java.util.ArrayList;

public class GenericsExample {

    public static int sum(ArrayList<? extends Number> array) {
        var sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i).intValue();
        }
        return sum;
    }

    public static void main(String[] args) {

        ArrayList<Number> array2 = new ArrayList<Number>();
        System.out.println(sum(array2));


        // Box[] array = new Box[10];
        ArrayList array = new ArrayList();

        array.add(10);
        array.add(12);
        array.add(14);

        /*array[1] = new Box(10);
        array[2] = new Box(12);
        array[3] = new Box(14);*/

        var sum = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof Integer)
                sum += (int) array.get(i);
        }
/*
        for (int i = 0; i < 3; i++) {
            if (array[i].getValue() instanceof Integer)
                sum += (int) array[i].getValue();
        }
*/
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        var sum1 = 0;
        for (int i = 0; i < array1.size(); i++) {
            sum1 += array1.get(i);
        }
        System.out.println(sum);

        var box = new Box<Integer>();
        box.setValue(1);
        var value = box.getValue();
        System.out.println(value + 5);
    }
}
