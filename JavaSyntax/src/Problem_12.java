import java.util.Scanner;

/*
Problem 12  Character Multiplier
Create a method that takes two strings as arguments and returns the sum of their character codes multiplied
(multiply str1.charAt (0) with str2.charAt (0) and add to the total sum). Then continue with the next two characters.
If one of the strings is longer than the other, add the remaining character codes to the total sum without multiplication.

 */
public class Problem_12 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[]input=console.nextLine().split(" ");
        String firstString=input[0];
        String secondString=input[1];
        int sum=0;
        int lenght=Math.max(firstString.length(), secondString.length());
        for (int i = 0; i <lenght; i++) {
            sum+=multiplyer(firstString, secondString,i);
        }
        System.out.println(sum);
    }
    public static int multiplyer(String firstString,String secondString,int i){
        int sum=0;
        int a=0;
        int b=0;
        try {
            a=firstString.charAt(i);
        }catch (StringIndexOutOfBoundsException ex) {
            a=1;
        }
        try{
            b=secondString.charAt(i);
        }catch (StringIndexOutOfBoundsException ex){
            b=1;
        }
        sum=a*b;

        return sum;
        }

    }
