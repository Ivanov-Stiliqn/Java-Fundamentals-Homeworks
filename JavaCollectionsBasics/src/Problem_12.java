import java.util.*;

/*
Problem 12.	Cards Frequencies
We are given a sequence of N playing cards from a standard deck. The input consists of several cards (face + suit), separated by
a space. Write a program to calculate and print at the console the frequency of each card face in format "card_face -> frequency".
The frequency is calculated by the formula appearances / N and is expressed in percentages with exactly 2 digits after the decimal
point. The card faces with their frequency should be printed in the order of the card face's first appearance in the input.
The same card can appear multiple times in the input, but it's face should be listed only once in the output.

 */
public class Problem_12 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[] text=console.nextLine().split("\\W+");
        LinkedHashMap<String,Integer>cards=new LinkedHashMap<>();
        int count=0;
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text.length; j++) {

                if(text[i].equals(text[j])){
                    count++;
                }
            }
            cards.put(text[i],count);
            count=0;
        }
        for (Map.Entry<String, Integer> card : cards.entrySet()) {
            double avg=(double)card.getValue()/text.length;
            System.out.printf("%s -> %.2f%%",card.getKey(),avg*100);
            System.out.println();

        }
    }
}
