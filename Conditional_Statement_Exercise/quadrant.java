package Conditional_Statement_Exercise;

import java.util.Scanner;
public class quadrant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x-coordinate and y-coordinate: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>0 & y>0)
            System.out.println("Q1");
        else if(x>0 & y<0)
            System.out.println("Q4");
        else if(x<0 & y<0)
            System.out.println("Q3");
        else
            System.out.println("Q2");
    }
}
