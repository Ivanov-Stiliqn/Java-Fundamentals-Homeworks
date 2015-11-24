import java.util.Scanner;

/*
Problem 6.	Convert from base-7 to decimal
Write a program that converts from a base-7 number to its decimal representation

 */
public class Problem_06 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String sevenBase=console.nextLine();
        int decimal=Integer.parseInt(sevenBase,7);
        System.out.println(decimal);
    }
}
