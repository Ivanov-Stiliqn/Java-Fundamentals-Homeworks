import java.util.Scanner;
import java.util.TreeSet;

/*
Problem 10.	Extract All Unique Words
At the first line at the console you are given a piece of text. Extract all words from it and print them in alphabetical order.
Consider each non-letter character as word separator. Take the repeating words only once. Ignore the character casing.
Print the result words in a single line, separated by spaces.

 */
public class Problem_10 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[] text=console.nextLine().toLowerCase().split("[^a-zA-z]+");
        TreeSet<String>words=new TreeSet<>();
        for (String s : text) {
            words.add(s);
        }
        for (String word : words) {
            System.out.print(word+" ");
        }
    }
}
