import java.util.Scanner;

/*
Problem08   Odd and Even Pairs
You are given an array of integers as a single line, separated by a space. Write a program that checks consecutive pairs
and prints if both are odd/even or not. Note that the array length should also be an even number

 */
public class Problem_08 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[] input=console.nextLine().split(" ");
        for (int i = 0; i < input.length-1; i+=2) {
            int num=Integer.parseInt(input[i]);
            int num2=Integer.parseInt(input[i+1]);
            if(input.length%2!=0){
                System.out.println("Invalid length");
                break;
            }
            if(num%2==0&&num2%2==0){

                System.out.printf("%d, %d -> both are even", num, num2);
                System.out.println();
            }else if(num%2!=0&&num2%2!=0){

                System.out.printf("%d, %d -> both are odd", num, num2);
                System.out.println();
            }else{

                System.out.printf("%d, %d -> different", num, num2);
                System.out.println();
            }
        }
    }
}
