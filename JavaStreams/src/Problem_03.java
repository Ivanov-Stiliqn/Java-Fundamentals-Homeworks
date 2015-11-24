import java.io.*;
import java.nio.Buffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Problem 3.	Count character types.
Write a program that reads a list of words from the file words.txt and finds the count of vowels (гласни букви), consonants (съгласни) and other punctuation marks. Since English is a bit tricky, assume that a, e, i, o, u are vowels and all others are consonants. Punctuation marks are (!,.?). Do not count whitespace.
Write the results in file count-chars.txt.

 */
public class Problem_03 {
    public static void main(String[] args) {

        int vowels=0;
        int consonants=0;
        int puctuation=0;
        try (
            BufferedReader bfr=
                    new BufferedReader(
                            new FileReader("resources/problem_03/words.txt"));
            PrintWriter prw=
                    new PrintWriter(
                            new FileWriter(
                                    new File("resources/problem_03/count-chars.txt")))){
            String line="";
            while((line=bfr.readLine())!=null){
                vowels+=countVowels(line);
                consonants+=countConsonants(line);
                puctuation+=countPunctuation(line);
            }
            prw.println("Vowels: "+vowels);
            prw.println("Consonants: "+consonants);
            prw.println("Punctuation: "+puctuation);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public static int countVowels(String line){
        int count=0;
        Pattern pattern=Pattern.compile("[aioue]");
        Matcher matcher=pattern.matcher(line);
        while(matcher.find()){
            count++;
        }
        return count;
    }

    public static int countConsonants(String line){
        int count=0;
        Pattern pattern=Pattern.compile("[^aeiou?,.!\\s]");
        Matcher matcher=pattern.matcher(line);
        while(matcher.find()){
            count++;
        }
        return count;
    }

    public static int countPunctuation(String line){
        int count=0;
        Pattern pattern=Pattern.compile("[?,.!]");
        Matcher matcher=pattern.matcher(line);
        while(matcher.find()){
            count++;
        }
        return count;
    }
}
