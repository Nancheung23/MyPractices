package io_1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class test1 {
    // using javac, not in same parent (only access absolute)
    public static void main(String[] args) throws IOException{
        // File.separator (also)
        File testFile = new File("C:\\Users\\zhang\\OneDrive\\桌面\\test.txt");
        System.out.println("File size: "+  testFile.length() + " Bytes");
        // Directory
        File testDirectory = new File("C:\\Users\\zhang\\OneDrive\\桌面");
        System.out.println("File size: "+  testDirectory.length() + " Bytes");
        // non exist
        File nonExist = new File("C:\\Users\\zhang\\OneDrive\\桌面\\nonExist");
        if (nonExist.exists()) {
            System.out.println("File nonExist exists.");
        } else {
            System.out.println("File is not exist.");
        }
        // absolute: X: ... \\ filename.extension
        // canonical: ..\\ filename.extension
        // File relative = new File("src\\io_1\\test.txt");
        String exePath = "C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src";
        String fileStr = "C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test.txt";
        File origin = new File(exePath);
        File target = new File(fileStr);
        StringBuilder related = new StringBuilder(getRelativePath(origin, target));
        System.out.println(related);

        File relative = new File("io_1\\test.txt");
        String msg = relative.exists() ? ("File size: " + relative.length() + " Byte.") : "Not exists.";
        System.out.println(msg);
        
    }
        public static String getRelativePath(File base, File target) throws IOException {
        Path basePath = base.getCanonicalFile().toPath();
        Path targetPath = target.getCanonicalFile().toPath();
        Path relativePath = basePath.relativize(targetPath);
        return relativePath.toString();
    }
}