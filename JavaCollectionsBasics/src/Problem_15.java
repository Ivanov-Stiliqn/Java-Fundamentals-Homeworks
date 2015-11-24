import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Problem 15  Implement Recursive Binary Search
Binary search is an algorithm that works on already sorted arrays. Basically, it goes to the middle element and checks it has
to continue searching to the left, or to the right. Return the index of the element, or -1, if the element is not found.

 */
public class Problem_15 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        int n=Integer.parseInt(console.nextLine());
        String[] input=console.nextLine().split(" ");
        int[]numbers=new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i]=Integer.parseInt(input[i]);
        }
        int bS=Arrays.binarySearch(numbers,n);
        System.out.println(bS);
    }
}
