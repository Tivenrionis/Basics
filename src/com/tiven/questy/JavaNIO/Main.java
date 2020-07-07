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

            ByteBuffer buffer = ByteBuffer.allocate(100);
            byte[] outputBytes = "Hello World!".getBytes();
            buffer.put(outputBytes);
            buffer.putInt(245);
            buffer.putInt(-98765);
            byte[] outBuf = "Nice to meet you".getBytes();
            buffer.put(outBuf);
            buffer.putInt(1000);
            buffer.flip();
            channel.write(buffer);


//            ByteBuffer buffer = ByteBuffer.allocate(outputBytes.length);
//            buffer.put(outputBytes);
//            buffer.flip();
//
//
//            int numBytes = channel.write(buffer);
//            System.out.println(numBytes + " Written");
//
//            //Ustaw buffer na 4 byte'y no tyle uzywa sie do zapisu INTEGERA
//            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
//            //Wrzuc liczbe, wtedy pozycja buffera przesuwa sie o 4 byte'y
//            intBuffer.putInt(245);
//            //Zresetuj pozycje buffera na 0 aby wpisywac od paczatku WAZNE
//            intBuffer.flip();
//            //Przy zapisywaniu pozycja buffera przesuwa się również o 4
//            numBytes = channel.write(intBuffer);
//            System.out.println(numBytes + " Written");
//            // dlatego znowu flip aby utawic na 0
//            intBuffer.flip();
//            intBuffer.putInt(-98765);
//            intBuffer.flip();
//            numBytes = channel.write(intBuffer);
//            System.out.println(numBytes + " Written");
//
//
//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            FileChannel raChannel = ra.getChannel();
//            outputBytes[0] = 'a';
//            outputBytes[1] = 'b';
//            buffer.flip();
//            long numBytesRead = raChannel.read(buffer);
//            if (buffer.hasArray()) {
//                System.out.println("byte buffer " + new String(buffer.array()));
//            }
//            System.out.println(numBytesRead + " Read");
//            System.out.println(new String(outputBytes));
//
//            //Absolute Read
//            intBuffer.flip();
//            numBytesRead = raChannel.read(intBuffer);
//            System.out.println(intBuffer.getInt(0));
//            intBuffer.flip();
//            numBytesRead = raChannel.read(intBuffer);
//            System.out.println(intBuffer.getInt(0));
//
///*    RELATIVE READ
//            intBuffer.flip();
//            numBytesRead = raChannel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());
//            intBuffer.flip();
//            numBytesRead = raChannel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());*/
//
//
//            raChannel.close();
//            ra.close();

       /*     RandomAccessFile ra = new RandomAccessFile("Data.dat", "rwd");
            byte[] b = new byte[outputBytes.length];
            ra.read(b);
            System.out.println(new String(b));

            long int1 = ra.readInt();
            long int2 = ra.readInt();

            System.out.println(int1);
            System.out.println(int2);*/


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
