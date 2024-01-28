package io_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ioStreamTest1 {
    public static void main(String[] args) throws IOException {
        // abstract
        // Byte: InputStream -> FileInputStream, OutputStream -> FileOutputStream
        // Char: Reader -> FileReader, Writer -> FileWriter


        // FileInputStream
        // InputStream inputFile = new FileInputStream(new File("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test.txt"));
        InputStream inputFile = new FileInputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test.txt");
        // if no byte return -1
        int char1 = inputFile.read();
        System.out.println((char)char1);
        int char2 = inputFile.read();
        System.out.println((char)char2);
        inputFile.close();
        System.out.println("============================");

        // loop
        InputStream inputFileLoop = new FileInputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test.txt");
        int b;
        while ((b = inputFileLoop.read()) != -1) {
            System.out.println((char) b);
        }
        inputFileLoop.close();

        // byte[] buffer *buffer[], need to set empty after one read(), or byte[3], if length = 5, will still have last byte (eg. abc66 -> 1st. [abc] -> 2st. [66"c"])
        InputStream byteArr = new FileInputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test.txt");
        byte[] buffer = new byte[1024 * 8];
        int intLen = byteArr.read(buffer);
        String result = new String(buffer);
        System.out.println(result);
        System.out.println(intLen);
        int intLen1 = byteArr.read(buffer);
        System.out.println(intLen1);
        byteArr.close();

        // loop buffer
        System.out.println("=====================================");
        InputStream byteArr1 = new FileInputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test.txt");
        byte[] buffer1 = new byte[3];
        int len;
        while ((len = byteArr1.read(buffer1)) != -1) {
            String resultLoop = new String(buffer1, 0, len);
            System.out.print(resultLoop);
        }
        byteArr1.close();

        // read all bytes
        System.out.println("===============================");
        InputStream byteArr2 = new FileInputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test1.txt");
        byte[] buffer2 = new byte[522];
        int len1;
        while ((len1 = byteArr2.read(buffer2)) != -1 ) {
            String resultStr = new String(buffer2, 0, len1);
            System.out.println(resultStr);
        }
        byteArr2.close();

        // read all bytes (2)
        System.out.println("===============================");
        InputStream byteArr3 = new FileInputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test1.txt");
        byte[] buffer3 = byteArr3.readAllBytes();
        System.out.println(new String(buffer3));
        byteArr3.close();
    }
}
