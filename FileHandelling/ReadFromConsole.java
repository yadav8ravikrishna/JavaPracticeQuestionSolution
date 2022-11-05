//7.Write a Java program to read input from the java console.

package FileHandelling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
    public static void main(String[] args) throws IOException {
        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter some text: ");
        String text = myReader.readLine();
        System.out.println("The Test you Entered is: " + text);

    }
}
