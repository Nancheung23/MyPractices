package io_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {
    public static void main(String[] args) {
        try (
            ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test5.txt"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test5.txt"));
            ) {
                // passWord already added transient
            User u = new User("admin","nan", 32, "abc123");
            // output a object
            oos.writeObject(u);
            
            // !!!ArrayList can implements Serializable interface!!!  -> for multiple objs

            // read the object
            System.out.println( ois.readObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
