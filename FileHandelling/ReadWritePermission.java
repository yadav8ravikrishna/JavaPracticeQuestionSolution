//4. Write a Java program to check if a file or directory has read and write permission.

package FileHandelling;

import java.io.File;

public class ReadWritePermission {
    public static void main(String[] args) {
        File myFile = new File("/home/bitch/Downloads/Untitled Document 1");
        if (myFile.canRead())
            System.out.println("can read this file");
        else
            System.out.println("cannot read");

        if (myFile.canWrite())
            System.out.println("can write on this file");
        else
            System.out.println("cannot write on this file");
    }
}
