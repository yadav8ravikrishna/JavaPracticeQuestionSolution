package loop;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ss Number: ");
        int n = sc.nextInt();
        int a=0, b=1;
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
