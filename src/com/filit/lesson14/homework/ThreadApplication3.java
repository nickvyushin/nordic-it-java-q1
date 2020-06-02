package com.filit.lesson14.homework;

import java.util.ArrayList;
import java.util.concurrent.*;

public class ThreadApplication3 {
    public static void main(String[] args) throws InterruptedException {
        var queue = new LinkedBlockingDeque<Integer>();
        var vector = new LinkedBlockingDeque<Integer>();

        for (var i = 0; i < 2000; i++)
            queue.add(i);

        var executorService = Executors.newFixedThreadPool(4);

        for (var i = 1; i <= 4; i++)
            executorService.execute(new MoverTask(queue, vector));
     //   executorService.awaitTermination(20, TimeUnit.SECONDS);

        executorService.shutdownNow();

        /*var threadPool = new ArrayList<Thread>();
        for (var i = 1; i <= 4; i++) {
            threadPool.add(new Thread(new MoverTask(queue, vector)));
        }
        for (var thread : threadPool) {
            thread.start();
        }
        for (var thread : threadPool) {
            thread.join();
        }*/
        System.out.println(queue.size());
        System.out.println(vector);
        System.out.println(vector.size());
    }
}
