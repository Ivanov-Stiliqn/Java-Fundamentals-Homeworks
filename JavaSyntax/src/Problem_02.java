/*
Problem 2.	Triangle Area
 Write a program that enters 3 points in the plane (as integer x and y coordinates),
 calculates and prints the area of the triangle composed by these 3 points.
 Round the result to a whole number. In case the three points do not form a triangle, print "0" as result.
*/


import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        int Ax=console.nextInt();
        int Ay=console.nextInt();
        int Bx=console.nextInt();
        int By=console.nextInt();
        int Cx=console.nextInt();
        int Cy=console.nextInt();
        double area=Math.abs(((Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By)) / 2));
        System.out.println((int)area);
    }
}
