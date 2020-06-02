/*package com.filit.lesson14.homework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

public class MoverCallable implements Callable<Integer> {

    private ArrayBlockingQueue<Integer> queue;
    private ArrayBlockingQueue<Integer> vector;

    public MoverCallable(ArrayBlockingQueue<Integer> queue, ArrayBlockingQueue<Integer> vector) {
        super();
        this.queue = queue;
        this.vector = vector;
    }

    private boolean moveElement() {
        var elem = queue.poll();
        if (elem != null) {
            vector.add(elem);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public Integer call() throws Exception {
        while (moveElement()) {
        }
    }
}*/
