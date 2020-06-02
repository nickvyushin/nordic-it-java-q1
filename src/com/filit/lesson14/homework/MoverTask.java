package com.filit.lesson14.homework;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class MoverTask implements Runnable {

    private LinkedBlockingDeque<Integer> queue;
    private LinkedBlockingDeque<Integer> vector;

    //private static Object lock = new Object();

    public MoverTask(LinkedBlockingDeque<Integer> queue, LinkedBlockingDeque<Integer> vector) {
        this.queue = queue;
        this.vector = vector;
    }

    @Override
    public void run() {
        while (moveElement()) {
            if (Thread.interrupted()) {
                System.out.println("Shutdown");
                return;
            }
        }
    }
    private boolean moveElement() {
   /*     Integer elem;

        synchronized (MoverTask.class) {
            if (queue.isEmpty()) {
                return false;
            } else {
                elem = queue.remove(0);
            }
        }*/

        var elem = queue.pollFirst();
        if (elem != null) {
            vector.add(elem);
            return true;
        } else {
            return false;
        }

    }
    }

