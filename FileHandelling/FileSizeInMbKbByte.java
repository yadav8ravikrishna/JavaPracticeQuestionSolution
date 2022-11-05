//8.Write a Java program to get file size in bytes, kb, mb.

package FileHandelling;

import java.io.File;

public class FileSizeInMbKbByte {
    public static void main(String[] args) {
        File myFile = new File("/home/bitch/Downloads/Untitled Document 1");
        double sizeInMb = (double) myFile.length() / (1024 * 1024);
        double sizeInKb = (double) myFile.length() / 1024;
        double sizeInBytes = myFile.length();

        System.out.println("Size in Mb is: " + sizeInMb);
        System.out.println("size in Kb is: " + sizeInKb);
        System.out.println("size in bytes is: " + sizeInBytes);
    }
}
