package com.filit.lesson17.homework;

import java.util.concurrent.ArrayBlockingQueue;

public class CashBox implements Runnable {

    private final ArrayBlockingQueue<Integer> unserved;
    private final ArrayBlockingQueue<Integer> served;


    public CashBox(ArrayBlockingQueue<Integer> unserved, ArrayBlockingQueue<Integer> served) {
        this.unserved = unserved;
        this.served = served;
    }

    @Override
    public void run() {
        while (process()) ;
    }

    public boolean process() {
        Integer client = unserved.poll();

        if (client == null) {
            return false;
        } else {
            served.add(client);
        }
        return true;
    }
}
