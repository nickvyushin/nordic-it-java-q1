package com.filit.lesson17.homework;

import java.util.concurrent.ArrayBlockingQueue;

public class Factory implements Runnable{

    private final ArrayBlockingQueue<Integer> rawPart;
    private final ArrayBlockingQueue<Integer> machinedPart;

    public Factory(ArrayBlockingQueue<Integer> rawPart, ArrayBlockingQueue<Integer> machinedPart) {
        this.rawPart = rawPart;
        this.machinedPart = machinedPart;
    }

    @Override
    public void run() {
        while (process());
    }

    private boolean process() {
        Integer detail = rawPart.poll();

        if (detail == null) {
            return false;
        } else {
            machinedPart.add(detail);
        }
        return true;
    }
}
