//10.Write a Java program to read a file content line by line.

package FileHandelling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/bitch/Downloads/Untitled Document 1"));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
    }
}
