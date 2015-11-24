import java.util.Scanner;

/*
Problem 5.	Count All Words
Write a program to count the number of words in given sentence. Use any non-letter character as word separator.

 */
public class Problem_05 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[]text=console.nextLine().split("[^a-zA-z]+");
        System.out.println(text.length);
    }
}
