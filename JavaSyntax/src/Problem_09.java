import java.util.Scanner;

/*
Problem 9.	*Hit the Target
Write a program that takes as input an integer – the target – and outputs to the console all pairs of numbers between 1 and 20,
which, if added or subtracted, result in the target.

 */
public class Problem_09 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        int target=console.nextInt();
        for (int i = 1; i <=20 ; i++) {
            for (int j = 1; j <=20 ; j++) {
                if(i-j==target) {

                    System.out.printf("%d - %d = %d", i, j, target);
                    System.out.println();
                }
                else if(i+j==target){

                    System.out.printf("%d + %d = %d", i, j, target);
                    System.out.println();

                }
            }
        }
    }
}
