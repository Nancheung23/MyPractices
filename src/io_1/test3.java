package io_1;

import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class test3 {
    public static void main(String[] args) throws IOException {
        // create file
        String fileStr = "C:\\Users\\zhang\\Desktop\\apply_new.txt";
        File createFile = new File(fileStr);
        boolean isCreate = createFile.createNewFile();
        if (isCreate) {
            System.out.printf("already create %s\n", fileStr);
        } else {
            if (createFile.exists()) {
                System.out.printf("failed to create file, already exists: %s", fileStr);
            } else {
                System.out.println("Unknown error!");
            }
        }

        // mkdir/ mkdirs
        File createDirectory = new File("C:\\Users\\zhang\\Desktop\\test");
        createDirectory.mkdir();

        File createDirectories = new File("C:\\Users\\zhang\\Desktop\\test\\test_suite");
        createDirectories.mkdirs();

        // delete
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int i = 10;

            @Override
            public void run() {
                // TODO Auto-generated method stub
                if (i > 0) {
                    System.out.println(i);
                    i--;
                } else {
                    createFile.delete();
                    // order issue: when need to delete, the dir has to be empty, so in this case
                    // delete test_suite first,
                    // then is able to delete test, otherwise delete for object createDirectory will
                    // return false.
                    createDirectories.delete();
                    createDirectory.delete();
                    System.out.println("delete all");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0, 1000);
    }
}
