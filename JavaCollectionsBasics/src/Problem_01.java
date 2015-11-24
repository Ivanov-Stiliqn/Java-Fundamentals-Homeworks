import java.util.Arrays;
import java.util.Scanner;

/*
Problem 1.	Sort Array of Numbers
Write a program to enter a number n and n integer numbers and sort and print them. Keep the numbers in array of integers: int[].

 */
public class Problem_01 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        int n=Integer.parseInt(console.nextLine());
        int[]numbers=new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i]=console.nextInt();
        }
        Arrays.sort(numbers);
        for (int number : numbers) {

            System.out.print(number+" ");
        }

    }
}
