package com.tiven.questy.JavaNIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {
    //you can get FileChannel out of 3 classes : FileInputStream FileOutputStream or RandomAccessFile
    public static void main(String[] args) {

        try (FileOutputStream binFile = new FileOutputStream("data.dat");
             FileChannel channel = binFile.getChannel()) {

            byte[] outputBytes = "Hello World!".getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(outputBytes);
            int numBytes = channel.write(buffer);
            System.out.println(numBytes + " Written");

            //Ustaw buffer na 4 byte'y no tyle uzywa sie do zapisu INTEGERA
            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            //Wrzuc liczbe, wtedy pozycja buffera przesuwa sie o 4 byte'y
            intBuffer.putInt(245);
            //Zresetuj pozycje buffera na 0 aby wpisywac od paczatku WAZNE
            intBuffer.flip();
            //Przy zapisywaniu pozycja buffera przesuwa się również o 4
            numBytes = channel.write(intBuffer);
            System.out.println(numBytes + " Written");
            // dlatego znowu flip aby utawic na 0
            intBuffer.flip();
            intBuffer.putInt(-98765);
            intBuffer.flip();
            numBytes = channel.write(intBuffer);
            System.out.println(numBytes + " Written");

//            FileInputStream file = new FileInputStream("data.txt");
//            FileChannel channel = file.getChannel();

            //Dla plikow tekstowych FILES class is the way to go

 /*           Path dataPath = FileSystems.getDefault().getPath("data.txt");
            Files.write(dataPath, "\nLine 5".getBytes("UTF-8"), StandardOpenOption.APPEND);
            List<String> lines = Files.readAllLines(dataPath);
            for (String line : lines) {
                System.out.println(line);
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
