import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Problem 6.	Count Specified Word
Write a program to find how many times a word appears in given text. The text is given at the first input line.
The target word is given at the second input line. The output is an integer number. Please ignore the character casing.
Consider that any non-letter character is a word separator.

*/
public class Problem_06 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[] text=console.nextLine().toLowerCase().split("[^a-zA-z]+");
        String word=console.nextLine();
        int count=0;
        for (int i = 0; i < text.length; i++) {

            if(text[i].equals(word)){
                count++;
            }
        }
        System.out.println(count);

    }
}
