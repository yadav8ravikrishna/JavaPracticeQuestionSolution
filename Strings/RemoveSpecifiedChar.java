//20.Write a Java program to create a new string after removing a specified character from
// a given string except the first and last position.

package Strings;

import java.util.Scanner;

public class RemoveSpecifiedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next().toLowerCase();
        System.out.print("Enter Specified Character you Want to Remove:");
        char specifiedChar = sc.next().charAt(0);
        System.out.print("String after removing Specified Character: ");
        System.out.println(removeAllSpecifiedChar(str, specifiedChar));
    }

    public static String removeAllSpecifiedChar(String stng, char ch) {
        Scanner sc = new Scanner(System.in);
        String fin_str = "";
        int l = stng.length();
        for (int i = 0; i < l; i++) {
            char temp = stng.charAt(i);
            if (!(i > 0 && i < l - 1 && temp == ch))
                fin_str = fin_str + temp;
        }
        return fin_str;
    }

}
