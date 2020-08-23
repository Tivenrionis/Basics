package com.tiven.questy.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread {
    private Socket socket;

    public Echoer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("Connected on thread: " + Thread.currentThread().getName());
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String echoString = input.readLine();
                System.out.println("Received from client " + Thread.currentThread().getName() + " " + echoString);
                if (echoString.equals("exit")) {
                    break;
                }
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                output.println("Echo from server: " + Thread.currentThread().getName() + " " + echoString);
            }
            System.out.println("Shutting down " + Thread.currentThread().getName());
        } catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
            // e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
