package io_2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CommonIOTest11 {
    public static void main(String[] args) throws IOException{
        FileUtils.copyFile(new File("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test5.txt"), new File("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test5_copyByCommonIO.txt"));
// FileUtils
        // copyFile
        // copyDirectory
        // deleteDirectory
        // readFileToString
        // writeStringToFile
// IOUtils
        // copy (inputStream -> outputStream)
        // copy (reader -> writer)
        // write (string -> outputStream)
    }
}
