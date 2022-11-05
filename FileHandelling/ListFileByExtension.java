//2.Write a Java program to get specific files by extensions from a specified folder.

package FileHandelling;

import java.io.File;

public class ListFileByExtension {
    public static void main(String[] args) {
        File myFile = new File("/home/bitch/Downloads/Spring Framework 5 Beginner to Guru/[TutsNode.com] - Spring Framework 5 Beginner to Guru/1. Introduction to Spring Framework 5 Beginner to Guru");
        String[] fileList = myFile.list();
        for (String file : fileList) {
            if (file.endsWith(".mp4")) {
                System.out.println(file);
            }
        }
    }
}
