import java.util.Scanner;

/*
Problem 3.	Largest Sequence of Equal Strings
Write a program that enters an array of strings and finds in it the largest sequence of equal elements.
If several sequences have the same longest length, print the leftmost of them. The input strings are given as a single line,
separated by a space.

*/
public class Problem_03 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        int count=0;
        int maxCount=0;
        String[]words=console.nextLine().split(" ");
        String element=words[0];
        for (int i = 0; i < words.length-1; i++) {

            count++;

            if(!words[i].equals(words[i+1])){
                if(maxCount<count){
                    maxCount=count;
                    element=words[i];
                }
                count=0;
            }
        }
        count++;
        if(maxCount<count){
            maxCount=count;
            element=words[words.length-1];
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(element+" ");
        }
    }
}
