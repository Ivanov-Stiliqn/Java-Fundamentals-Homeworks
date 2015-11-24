import java.util.Scanner;

/*
Problem 5.	Convert from decimal system to base-7
Write a program that takes an integer number and converts it to base-7

 */
public class Problem_05 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        int decimal=console.nextInt();
        String sevenBase=Integer.toString(decimal,7);
        System.out.println(sevenBase);
    }
}
