package com.tiven.questy.Threads;

import static com.tiven.questy.Threads.ThreadColor.*;

public class Main {
    // Kolejnosc watkow nie zawsze jest taka sama w tym przykladzie

    //SET PRIORITY to tylko sugestia dla systemu i JVM... nigdy nie ma gwarancji ze watki wywolaja sie w tej kolejnosci o chcesz
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main Thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous");
            }
        }.start();

        System.out.println(ANSI_PURPLE + "Hello again from main");

//        Thread myRunnableThread = new Thread(new MyRunnable());
//        myRunnableThread.start();
//DO RUNNABLE
        Thread myRunnableTread = new Thread(new MyRunnable()) {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from anonymous runnable");
                try {
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "Another thread terminated or timed out so Im running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldnt wait after all. I was interrupted.");
                }
            }
        };
        myRunnableTread.start();
        //anotherThread.interrupt();
    }
}
