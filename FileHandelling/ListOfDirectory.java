//1. Write a Java program to get a list of all file/directory names from the given.

package FileHandelling;

import java.io.File;

public class ListOfDirectory {
    public static void main(String[] args) {
        File file = new File("/home/bitch/Downloads");
        String[] fileList = file.list();
        for (String filename : fileList) {
            System.out.println(filename);
        }
    }
}
