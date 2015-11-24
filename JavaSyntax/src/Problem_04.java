import java.util.Scanner;

/*
Problem 4.	Calculate expression
Write a program that reads three floating point numbers from the console and calculates their result with the following formulae:
((a2 + b2) / (a2 – b2))(a + b + c) / ?c             (a2 + b2 - c3)(a – b)
Then calculate the difference between the average of the three numbers and the average of the two formulae:
 Average (a, b, c) – Average (f1, f2)
 */
public class Problem_04 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        double a=console.nextDouble();
        double b=console.nextDouble();
        double c=console.nextDouble();
        double f1=Math.pow(((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2))), ((a + b + c) / Math.sqrt(c)));
        double f2=Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)), (a - b));
        double diff=Math.abs(((a+b+c)/3)-((f1+f2)/2));
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, diff);


    }
}
