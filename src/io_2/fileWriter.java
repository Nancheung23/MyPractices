package io_2;

import java.io.FileWriter;
import java.io.Writer;

public class fileWriter {
    public static void main(String[] args) {
        // * need to flush or close stream to write in file
        // * refresh cache
        // .flush() ; .close()
        try (
            Writer fw = new FileWriter("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test.txt");
        ){
            // write one char
            fw.write('a');
            fw.write(97);
            fw.write('张');
            // write String
            fw.write("\r\n");
            fw.write("你好，我正在输出一个文档");
            // write part of string
            fw.write("\r\n");
            fw.write("你好，我正在输出一个文档", 3, 9);
            // write char[]
            char[] buffer = {'a', 'b', 'c'};
            fw.write("\r\n");
            fw.write(buffer);
            // write part of char[]
            fw.write("\r\n");
            fw.write(buffer, 1, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
