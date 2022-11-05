//6.Write a Java program to get the last modified time of a file.

package FileHandelling;

import java.io.File;
import java.util.Date;

public class LastModifiedDate {
    public static void main(String[] args) {
        File myFile = new File("/home/bitch/Downloads/Untitled Document 1");
        Date lastModifiedDate = new Date(myFile.lastModified());
        System.out.println("Untitled Document 1 was last modified on " + lastModifiedDate);
    }
}
