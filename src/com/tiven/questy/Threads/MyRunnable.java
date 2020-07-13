package com.tiven.questy.Threads;

import static com.tiven.questy.Threads.ThreadColor.ANSI_RED;

public class MyRunnable  implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from runnable class");
    }
}
