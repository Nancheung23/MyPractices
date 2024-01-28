package io_2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class transformStream {
    public static void main(String[] args) {
        try (
                // Reader fr = new
                // FileReader("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test.txt");
                InputStream is = new FileInputStream(
                        "C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test.txt");
                Reader isr = new InputStreamReader(is, "GBK");
                BufferedReader br = new BufferedReader(isr);

                OutputStream os = new FileOutputStream(
                    "C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test1.txt");
                Writer osw = new OutputStreamWriter(os, "UTF-8");
                BufferedWriter bw = new BufferedWriter(osw);
        // BufferedReader bfr = new BufferedReader(fr);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
