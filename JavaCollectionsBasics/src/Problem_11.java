

import java.util.*;

/*
Problem 11.	Most Frequent Word
Write a program to find the most frequent word in a text and print it, as well as how many times it appears in format "word -> count".
Consider any non-letter character as a word separator. Ignore the character casing. If several words have the same maximal frequency,
print all of them in alphabetical order

*/
public class Problem_11 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        TreeMap<Integer,List<String>>wordsFrequency=new TreeMap<>();
        String[] text=console.nextLine().toLowerCase().split("[^a-zA-z]+");
        int count=0;
        int maxCount=0;
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text.length; j++) {

                if(text[i].equals(text[j])){
                    count++;
                }
            }
            if(!wordsFrequency.containsKey(count)) {
                wordsFrequency.put(count, new ArrayList<String>());
            }
            if(!wordsFrequency.get(count).contains(text[i])) {
                wordsFrequency.get(count).add(text[i]);
            }
            if(maxCount<count){
                maxCount=count;
            }
            count=0;
        }
        Collections.sort(wordsFrequency.get(maxCount));
        for (int i = 0; i < wordsFrequency.get(maxCount).size(); i++) {

            System.out.printf(wordsFrequency.get(maxCount).get(i)+" -> %d times",maxCount);
            System.out.println();
        }
    }
}
