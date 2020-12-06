package com.filit.lesson17.homework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Factory {
    public static void main(String[] args) throws InterruptedException {

        var notProcessed = new ArrayBlockingQueue<Integer>(20);
        var processed = new ArrayBlockingQueue<Integer>(20);
        var executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            notProcessed.add(i);
        }

        var process1 = new Thread(new CashBox(notProcessed, processed));
        var process2 = new Thread(new CashBox(notProcessed, processed));
        var process3 = new Thread(new CashBox(notProcessed, processed));
        var process4 = new Thread(new CashBox(notProcessed, processed));
        var process5 = new Thread(new CashBox(notProcessed, processed));
        var process6 = new Thread(new CashBox(notProcessed, processed));

        executor.execute(process1);
        executor.execute(process2);
        executor.execute(process3);
        executor.execute(process4);
        executor.execute(process5);
        executor.execute(process6);

        executor.awaitTermination(10, TimeUnit.SECONDS);

        executor.shutdown();

        process1.start();
        process2.start();
        process3.join();
        process3.start();
        process4.join();
        process5.join();
        process4.start();
        process5.start();
        process6.join();
        process6.start();
    }
}
