package com.tiven.questy.Networking;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerMain {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {

            while (true) {

                new Echoer((serverSocket.accept())).start();
            }

        } catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
            // e.printStackTrace();
        }
    }
}
