package com.tiven.questy.JavaNIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {
    //you can get FileChannel out of 3 classes : FileInputStream FileOutputStream or RandomAccessFile
    public static void main(String[] args) {

        try (FileOutputStream binFile = new FileOutputStream("data.dat");
             FileChannel channel = binFile.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(100);
/*            byte[] outputBytes = "Hello World!".getBytes();
            byte[] outBuf = "Nice to meet you".getBytes();
            buffer.put(outputBytes).putInt(245).putInt(-98765).put(outBuf).putInt(1000);
            buffer.flip();*/

            byte[] outputBytes = "Hello World!".getBytes();
            buffer.put(outputBytes);
            long int1Pos = outputBytes.length;
            buffer.putInt(245);
            long int2Pos = int1Pos + Integer.BYTES;
            buffer.putInt(-98765);
            byte[] outBuf = "Nice to meet you".getBytes();
            buffer.put(outBuf);
            long int3Pos = int2Pos + Integer.BYTES + outBuf.length;
            buffer.putInt(1000);
            buffer.flip();
            channel.write(buffer);

            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
            FileChannel fileChannel = ra.getChannel();

            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
            fileChannel.position(int3Pos);
            fileChannel.read(readBuffer);
            readBuffer.flip();

            System.out.println("Int3 = " + readBuffer.getInt());

            readBuffer.flip();
            fileChannel.position(int2Pos);
            fileChannel.read(readBuffer);
            readBuffer.flip();

            System.out.println("INT2 =" + readBuffer.getInt());

            readBuffer.flip();
            fileChannel.position(int1Pos);
            fileChannel.read(readBuffer);
            readBuffer.flip();

            System.out.println("INT1 = " + readBuffer.getInt());

            byte[] outputString = "Hello World!".getBytes();
            long str1Pos = 0;
            long newInt1Pos = outputString.length;
            long newInt2Pos = newInt1Pos + Integer.BYTES;
            byte[] outputString2 = "Nice to meet you111".getBytes();
            long str2Pos = newInt2Pos + Integer.BYTES;
            long newInt3Pos = str2Pos + outputString2.length;

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);

            intBuffer.putInt(245);
            intBuffer.flip();
            channel.position(newInt1Pos);
            channel.write(intBuffer);

            intBuffer.flip();
            intBuffer.putInt(-98765);
            intBuffer.flip();
            channel.position(newInt2Pos);
            channel.write(intBuffer);

            intBuffer.flip();
            intBuffer.putInt(1000);
            intBuffer.flip();
            channel.position(newInt3Pos);
            channel.write(intBuffer);

            channel.position(str1Pos);
            channel.write(ByteBuffer.wrap(outputString));
            channel.position(str2Pos);
            channel.write(ByteBuffer.wrap(outputString2));


  /*          ByteBuffer readBuffer = ByteBuffer.allocate(100);
            fileChannel.read(readBuffer);
            readBuffer.flip();
            byte[] inputString = new byte[outputBytes.length];
            readBuffer.get(inputString);
            System.out.println("input string = " + new String(inputString));
            System.out.println("int1 = " + readBuffer.getInt());
            System.out.println("int2 = " + readBuffer.getInt());
            byte[] inputString2 = new byte[outBuf.length];
            readBuffer.get(inputString2);
            System.out.println("input string2 = " + new String(inputString2));
            System.out.println("int3 = " + readBuffer.getInt());*/


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
