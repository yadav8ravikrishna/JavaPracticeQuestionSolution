//9. Write a Java program to read contents from a file into byte array.

package FileHandelling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadIntoByteArray {
    public static void main(String[] args) throws IOException {
        FileInputStream fl = new FileInputStream("/home/bitch/Downloads/Untitled Document 1");
        byte[] arr = new byte[2 * 1024];
        int count = 0;
        while ((count = fl.read(arr)) > 0) {
            System.out.println(new String(arr, 0, count - 1));
        }
    }
}
