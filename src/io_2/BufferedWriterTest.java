package io_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterTest {
    public static void main(String[] args) {
        // * need to flush or close stream to write in file
        // * refresh cache
        // .flush() ; .close()
        try (
            Writer fw = new FileWriter("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test.txt");
            BufferedWriter bfw = new BufferedWriter(fw);
        ){
            // write one char
            bfw.write('a');
            bfw.write(97);
            bfw.write('张');
            // write String
            bfw.newLine();
            // bfw.write("\r\n");
            bfw.newLine();
            bfw.write("你好，我正在输出一个文档");
            // write part of string
            // bfw.write("\r\n");
            bfw.newLine();
            bfw.write("你好，我正在输出一个文档", 3, 9);
            // write char[]
            char[] buffer = {'a', 'b', 'c'};
            // bfw.write("\r\n");
            bfw.newLine();
            bfw.write(buffer);
            // write part of char[]
            // bfw.write("\r\n"); 
            bfw.newLine();
            bfw.write(buffer, 1, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
