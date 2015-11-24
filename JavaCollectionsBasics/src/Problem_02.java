import java.util.Scanner;

/*
Problem 2.	Sequences of Equal Strings
Write a program that enters an array of strings and finds in it all sequences of equal elements.
The input strings are given as a single line, separated by a space.

 */
public class Problem_02 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[]words=console.nextLine().split(" ");
        for (int i = 1; i < words.length; i++) {

            System.out.print(words[i-1]+" ");

            if(!words[i].equals(words[i-1])){
                System.out.println();
            }
        }
        System.out.print(words[words.length-1]);
    }
}
