package io_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ioStreamTest3Copy {
    public static void main(String[] args) throws Exception {
        InputStream file = null;
        OutputStream fileCopy = null;
        try {
            // get
            file = new FileInputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test1.txt");

            // read
            byte[] bytes = file.readAllBytes();
            System.out.println(new String(bytes));

            // copy
            fileCopy = new FileOutputStream(
                    "C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test1_copy.txt");
            fileCopy.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // close
            try {
                if (fileCopy != null) {
                    fileCopy.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (file != null) {
                    file.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("copy completed"); // can copy everything, need same extension
        }
    }
}
