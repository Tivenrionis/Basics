package com.tiven.questy.Threads.Massages;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Massage massage = new Massage();

        new Thread(new Writer(massage)).start();
        new Thread(new Reader(massage)).start();

    }
}

class Massage {
    private String massage;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        empty = true;
        notifyAll();
        return massage;
    }

    public synchronized void write(String massage) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {

            }

        }
        empty = false;
        this.massage = massage;
        notifyAll();
    }

}

class Reader implements Runnable {
    private Massage massage;

    public Reader(Massage massage) {
        this.massage = massage;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (String lastMassage = massage.read(); !lastMassage.equals("Finished"); lastMassage = massage.read()) {
            System.out.println(lastMassage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {

            }
        }

    }
}

class Writer implements Runnable {
    private Massage massage;

    public Writer(Massage massage) {
        this.massage = massage;
    }

    @Override
    public void run() {
        String[] massages = {
                "Something is wrong I can feel it",
                "Anything hsbjdsmkmksldc",
                "Enigma isnt thread safe",
                "WTF xd omg lol"
        };

        Random random = new Random();

        for (int i = 0; i < massages.length; i++) {
            massage.write(massages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                System.out.println("error in " + e.getMessage());
            }

        }
        massage.write("Finished");

    }
}
