import java.util.Scanner;

/*
Problem 5.   Print a Character Triangle
Create a triangle of characters, based on input. Learn about java.util.Scanner and Integer.parseInt ().
Test your program with integers up to 26. Think why.

 */
public class Problem_05 {
    public static void main(String[] args) {

        Scanner console =new Scanner(System.in);
        int n=Integer.parseInt(console.nextLine());

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(97+j)+" ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j=0; j < i; j++) {
                System.out.print((char)(97+j)+" ");
            }
            System.out.println();
        }
    }
}
