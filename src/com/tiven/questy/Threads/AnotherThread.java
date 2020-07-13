package com.tiven.questy.Threads;

import static com.tiven.questy.Threads.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from AnotherThread");
    }
}
