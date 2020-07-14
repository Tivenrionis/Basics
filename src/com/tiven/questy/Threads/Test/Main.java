package com.tiven.questy.Threads.Test;


public class Main {



    public static void main(String[] args) {
        PaintingRobot R11 = new PaintingRobot();
        PaintingRobot R12 = new PaintingRobot();

        Thread t1 = new Thread(new IndustrialRobot(R11));
        t1.setName("R11");
        Thread t2 = new Thread(new IndustrialRobot(R11));
        t2.setName("\tR12");
        t1.start();
        t2.start();

    }


    private static class PaintingRobot {
        private int painting;
        private static Object interlock1 = new Object();
        private static Object interlock2 = new Object();

        public void doPaint() {

            //System.out.println(Thread.currentThread().getName() + " :: Zamierzam pomalowac kaste ");
            // System.out.println(painting);

            synchronized (interlock1) {
                // try{Thread.sleep(1000);}catch (InterruptedException e){}
                System.out.println(Thread.currentThread().getName() + " :: Wjechalem w strefe 1 trzymam interlock1");
                System.out.println(Thread.currentThread().getName() + " :: Maluje - ");
                synchronized (interlock2) {
                    for (painting = 0; painting <= 10; painting++) {
                        System.out.println(Thread.currentThread().getName() + " Maluje pierwsza " + painting);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " :: wypuszczam interlock1");
            }
            synchronized (interlock2) {
                System.out.println(Thread.currentThread().getName() + " :: Wjechalem w strefe 2 trzymam interlock2");

                synchronized (interlock2) {
                    for (painting = 0; painting <= 10; painting++) {
                        System.out.println(Thread.currentThread().getName() + " Maluje druga " + painting);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " :: Skonczyłem malować wypuszczam interlock2");
            }


        }
    }


    private static class IndustrialRobot implements Runnable {
        private PaintingRobot robot;

        public IndustrialRobot(PaintingRobot robot) {
            this.robot = robot;
        }

        @Override
        public void run() {
           // System.out.println(Thread.currentThread().getName() + " Zaczynam");
            robot.doPaint();
            //System.out.println(Thread.currentThread().getName() + " Skonczylem");
        }
    }
}

