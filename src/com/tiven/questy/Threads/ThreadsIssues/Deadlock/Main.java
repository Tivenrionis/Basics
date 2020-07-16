package com.tiven.questy.Threads.ThreadsIssues.Deadlock;

public class Main {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());

        t1.start();
        t2.start();

    }

    private static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1 Holding lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread 1 Waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread 1 Holding lock2");
                }
                System.out.println("Thread 1 Released lock2");
            }
            System.out.println("Thread 1 Released lcok1");
        }
    }

    private static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread 2 Holding lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread 2 Waiting for lock2");
                synchronized (lock1) {
                    System.out.println("Thread 2 Holding lock2");
                }
                System.out.println("Thread 2 Released lock2");
            }
            System.out.println("Thread 2 Released lcok1");
        }
    }

}
