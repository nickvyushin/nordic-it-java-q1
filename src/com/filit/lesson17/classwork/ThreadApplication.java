package com.filit.lesson17.classwork;

public class ThreadApplication {
    public static void main(String[] args) throws InterruptedException {
        var thread1 = new Thread(new HalloWorldTask(1));
        var thread2 = new Thread(new HalloWorldTask(2));
        var thread3 = new Thread(new HalloWorldTask(3));
        var thread4 = new Thread(new HalloWorldTask(4));

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
        thread4.start();
        thread4.join();

    }
}
