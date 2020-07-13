package com.tiven.questy.Threads;

import static com.tiven.questy.Threads.ThreadColor.*;

public class Main {
    // Kolejnosc watkow nie zawsze jest taka sama w tym przykladzie
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main Thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        System.out.println(ANSI_CYAN + "Hello again from main");

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous");
            }
        }.start();
    }
}
