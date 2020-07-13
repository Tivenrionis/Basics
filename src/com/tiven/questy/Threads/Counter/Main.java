package com.tiven.questy.Threads.Counter;

import static com.tiven.questy.Threads.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");

        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();

    }
}

class Countdown {
    //MAGIC - THREAD INTERFERENCE
    // Class fields or private fields are stored in the HEAP which is shared among all threads
    // - issue cause we r passing the same object
    private int i;

    public void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ANSI_CYAN;
                break;
            case "Thread 2":
                color = ANSI_PURPLE;
                break;
            default:
                color = ANSI_GREEN;
                break;
        }
// LOCAL VARIABLES are stored on the STACK where each Thread has its own copy of
        for (i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
        }
    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown threadCountdown) {
        this.threadCountdown = threadCountdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}