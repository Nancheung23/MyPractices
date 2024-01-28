package io_1;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class ioStreamTest2 {
    // FileOutputStream
    // public static void main(String[] args) throws Exception{
    // OutputStream file = new
    // FileOutputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test2.txt");

    // can add append = true
    public static void main(String[] args) throws Exception {
        OutputStream file = new FileOutputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test2.txt", true);
        // write 1 byte
        file.write(97); // 'a'
        file.write('b'); // also can be a int
        file.write('楠'); // get first byte of 3

        // write bytes
        byte[] bytes = "你好，见到你很高兴".getBytes();
        file.write(bytes);

        // write specific str (target, offset, length)
        // change row: \r\n
        file.write("\r\n".getBytes());
        file.write(bytes, 0, 15);
        file.close();

    }
}
