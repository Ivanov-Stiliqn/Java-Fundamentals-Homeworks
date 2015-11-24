import java.util.Scanner;

/*
Problem 4.	Longest Increasing Sequence
Write a program to find all increasing sequences inside an array of integers.
The integers are given in a single line, separated by a space. Print the sequences in the order of their appearance in the input array,
each at a single line. Separate the sequence elements by a space. Find also the longest increasing sequence and
print it at the last line. If several sequences have the same longest length, print the leftmost of them.


*/
public class Problem_04 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        int count=0;
        int maxCount=0;
        String[]words=console.nextLine().split(" ");
        int index=0;
        int maxIndex=0;
        for (int i = 0; i < words.length-1; i++) {

            count++;
            System.out.print(words[i]+" ");

            if(!(Integer.parseInt(words[i]) < Integer.parseInt(words[i + 1]))){
                if(maxCount<count){
                    maxCount=count;
                    maxIndex=index;
                }
                System.out.println();
                count=0;
                index=i+1;
            }
        }
        count++;
        System.out.println(words[words.length-1]);
        if(maxCount<count){
            maxCount=count;
            maxIndex=index;

        }
        System.out.print("Longest: ");
        for (int i = 0; i < maxCount; i++) {
            System.out.print(words[maxIndex+i]+" ");
        }
    }
}

