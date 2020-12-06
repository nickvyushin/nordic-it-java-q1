package com.filit.lesson17.homework;

import java.util.concurrent.ArrayBlockingQueue;

public class ProductionLine implements Runnable{

    private final ArrayBlockingQueue<Integer> notProcessed;
    private final ArrayBlockingQueue<Integer> processed;

    public ProductionLine(ArrayBlockingQueue<Integer> notProcessed, ArrayBlockingQueue<Integer> processed) {
        this.notProcessed = notProcessed;
        this.processed = processed;
    }

    @Override
    public void run() {
        while (process()) ;
    }
        public boolean process() {
            Integer client = notProcessed.poll();

            if (client == null) {
                return false;
            } else {
                processed.add(client);
            }
            return true;
        }
    }
