import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 Problem10  Extract words
 Write a program that extracts words from a string. Words are sequences of characters that are at least two symbols long
  and consist only of English alphabet letters. Use regex.
 */
public class Problem_10 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String input=console.nextLine();
        Pattern pat=Pattern.compile("([a-zA-z]{2,})");
        Matcher matcher=pat.matcher(input);
        while(matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }
}
