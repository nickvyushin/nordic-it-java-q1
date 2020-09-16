package com.filit.lesson17.classwork;

public class HalloWorldTask implements Runnable {

    private int number;

    public HalloWorldTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Привет, мир! Поток: " + this.number);

        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Я проснулся, поток: " + this.number);
    }
}
