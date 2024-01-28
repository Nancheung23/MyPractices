package io_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStream {
    public static void main(String[] args) {
        try (
                DataOutputStream dos = new DataOutputStream(
                        new FileOutputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test4.txt",
                                true));
                DataInputStream dis = new DataInputStream(new FileInputStream(
                        "C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test4.txt"))) {
            dos.writeInt(97);
            dos.writeDouble(1111.111);
            dos.writeBoolean(false);
            dos.writeUTF("Halooo");
            // inputStream
            int i = dis.readInt();
            System.out.println(i);
            double d = dis.readDouble();
            System.out.println(d);
            boolean b = dis.readBoolean();
            System.out.println(b);
            String s = dis.readUTF();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
