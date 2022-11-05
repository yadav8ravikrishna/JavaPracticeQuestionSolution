//3.Write a Java program to check if a file or directory specified by pathname exists or not.

package FileHandelling;

import java.io.File;

public class FileExistence {
    public static void main(String[] args) {
        File myFile = new File("/home/bitch/Downloads/nepal-latest.osm.pbf");
        if (myFile.exists())
            System.out.println("File Exists");
        else
            System.out.println("File does not Exist");
    }
}
