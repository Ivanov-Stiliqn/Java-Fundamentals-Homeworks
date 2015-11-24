import java.util.Scanner;

/*
Problem 6.	 Sum numbers from 1 to N
Create a Java program that reads a number N from the console and calculates the sum of all numbers from 1 to N
 */
public class Problem_06 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        int n=Integer.parseInt(console.nextLine());
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
