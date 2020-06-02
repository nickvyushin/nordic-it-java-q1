/*
package com.filit.lesson14.homework;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadApplication4 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        var queue = new ArrayBlockingQueue<Integer>(2000);
        var vector = new ArrayBlockingQueue<Integer>(2000);

        for (var i = 1; i <= 2000; i++)
            queue.put(i);


        var executorService = Executors.newFixedThreadPool(4);

        var arrayList = new ArrayList<Future<Integer>>();
        for (var i = 1; i <= 4; i++) {
            var task = executorService.submit(new MoverCallable(queue,vector));
            arrayList.add(task);
        }

        for (var i = 0; i < 4; i++) {
            arrayList.get(i).get();
        }

        executorService.shutdownNow();


        System.out.println(queue.size());
        System.out.println(vector);
        System.out.println(vector.size());

    }

}
*/
