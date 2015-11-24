import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Problem 9.	Combine Lists of Letters
Write a program that reads two lists of letters l1 and l2 and combines them: appends all letters c from l2 to the end of l1,
but only when c does not appear in l1. Print the obtained combined list. All lists are given as sequence of letters separated
by a single space, each at a separate line. Use ArrayList<Character> of chars to keep the input and output lists.

*/
public class Problem_09 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String firstList=console.nextLine();
        String secondList=console.nextLine();
        List<Character> l1= new ArrayList<>();
        List<Character>output=new ArrayList<>();
        List<Character> l2= new ArrayList<>();
        for (int i = 0; i <firstList.length() ; i++) {
            l1.add(firstList.charAt(i));
            output.add(firstList.charAt(i));
        }

        for (int i = 0; i <secondList.length() ; i++) {
            l2.add(secondList.charAt(i));
        }

        for (Character character : l2) {
            if(!l1.contains(character)){
                output.add(' ');
                output.add(character);
            }
        }
        for (Character character : output) {
            System.out.print(character);
        }
    }
}
