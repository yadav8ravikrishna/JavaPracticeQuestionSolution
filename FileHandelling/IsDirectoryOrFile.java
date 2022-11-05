//5.  Write a Java program to check if a given pathname is a directory or a file.

package FileHandelling;

import java.io.File;

public class IsDirectoryOrFile {
    public static void main(String[] args) {
        File myFileOrDir = new File("/home/bitch/Downloads");
        if (myFileOrDir.isDirectory())
            System.out.println("this is a Directory");
        if (myFileOrDir.isFile())
            System.out.println("This is a File");
    }
}
