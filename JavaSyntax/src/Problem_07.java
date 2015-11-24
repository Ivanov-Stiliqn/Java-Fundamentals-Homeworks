import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
Problem 7.	Randomize numbers from N to M
Write a program that takes as input two integers N and M, and randomizes the numbers between them.
Note that M may be smaller than or equal to N.

 */
public class Problem_07 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        int n = console.nextInt();
        int m = console.nextInt();
        int start=Math.min(n, m);
        int end=Math.max(n, m);
        List<Integer>nums=new ArrayList<Integer>();
        while(nums.size()<(end-start)+1){
            Random rn = new Random();
            int range = (end - start) + 1;
            int randomNum =  rn.nextInt(range) + start;
            if(!nums.contains(randomNum))
                nums.add(randomNum);
        }
        for (int num:nums){
            System.out.print(num+" ");
        }
    }
}
