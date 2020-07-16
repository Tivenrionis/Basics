package com.tiven.questy.Threads.Challanges;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234-567", 1000);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                bankAccount.deposit(300);
                bankAccount.withdraw(50);

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                bankAccount.deposit(203.75);
                bankAccount.withdraw(100);


            }
        });

        t1.start();
        t2.start();
    }


}
