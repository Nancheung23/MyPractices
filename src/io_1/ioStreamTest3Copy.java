package io_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ioStreamTest3Copy {
    public static void main(String[] args) throws Exception{
        // get
        InputStream file = new FileInputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test1.txt");

        // read
        byte[] bytes = file.readAllBytes();
        System.out.println(new String(bytes));

        // copy
        OutputStream fileCopy = new FileOutputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test1_copy.txt");
        fileCopy.write(bytes);

        // close
        fileCopy.close();
        file.close();

        System.out.println("copy completed"); // can copy everything, need same extension
    }
}
