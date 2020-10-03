package com.filit.lesson17.homework;

import java.util.Vector;
import java.util.concurrent.*;

public class StoreExample {
    public static void main(String[] args) throws InterruptedException {
        var unservedCustomers = new ArrayBlockingQueue<Integer>(20);
        var servedCustomers = new ArrayBlockingQueue<Integer>(20);

        // изучены ArrayBlockingQueue, LinkedBlockingQueue, CopyOnWriteArrayList, ConcurrentHashMap, ConcurrentSkipListMap


        var executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            unservedCustomers.add(i);
        }

        var cashbox1 = new Thread(new CashBox(unservedCustomers, servedCustomers));
        var cashbox2 = new Thread(new CashBox(unservedCustomers, servedCustomers));
        var cashbox3 = new Thread(new CashBox(unservedCustomers, servedCustomers));
        var cashbox4 = new Thread(new CashBox(unservedCustomers, servedCustomers));

        executor.execute(cashbox1);
        executor.execute(cashbox2);
        executor.execute(cashbox3);
        executor.execute(cashbox4);

        executor.awaitTermination(10, TimeUnit.SECONDS);

        executor.shutdown();

        /*cashbox1.start();
        cashbox2.start();
        cashbox3.start();
        cashbox4.start();

        cashbox1.join();
        cashbox2.join();
        cashbox3.join();
        cashbox4.join();*/

        System.out.println(unservedCustomers.size());
        System.out.println(servedCustomers);
        System.out.println(servedCustomers.size());

    }
}
