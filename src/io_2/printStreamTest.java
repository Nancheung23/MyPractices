package io_2;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class printStreamTest {
    public static void main(String[] args) {
        // can to path, select charset, autoFlush
        // .println(), .write()
        try (
                PrintStream ps = new PrintStream(
                        "C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test1.txt");
                // if want to append, need to tranform to low class stream
                PrintWriter pr = new PrintWriter(
                        new FileOutputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test2.txt"),
                        true);) {
            ps.println("abc");
            ps.println(18);
            ps.println(true);
            // .write() -> no '\n'
            ps.write(97);
            ps.write(108);

            // writer
            pr.println("abcde");
            pr.println(19);
            pr.println(false);
            // .write()
            ps.write(98);
            ps.write(109);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
