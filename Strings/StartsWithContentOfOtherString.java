//19. Write a Java program to check whether a given string starts with the contents of another string.

package Strings;

import java.util.Scanner;

public class StartsWithContentOfOtherString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String");
        String str1 = sc.nextLine();
        System.out.print("Enter another String");
        String str2 = sc.nextLine();
        String[] arraystr2 = str2.split(" ");
        System.out.println(startsWith(str1, arraystr2));
    }

    static boolean startsWith(String str, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (str.startsWith(arr[i]))
                return true;
        }
        return false;
    }
}
