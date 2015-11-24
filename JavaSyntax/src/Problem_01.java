//Problem 1.	Rectangle Area
//Write a program that enters the sides of a rectangle (two integers a and b) and calculates and prints the rectangle's area.

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        int a=console.nextInt();
        int b=console.nextInt();
        int S=a*b;
        System.out.println(S);
    }
}
