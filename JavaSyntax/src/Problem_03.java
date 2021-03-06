import java.util.Scanner;

/*
Problem 3.	Formatting Numbers
 Write a program that reads 3 numbers: an integer a (0 ? a ? 500), a floating-point b and a floating-point c and prints them in 4 virtual
columns on the console. Each column should have a width of 10 characters. The number a should be printed in hexadecimal, left aligned;
then the number a should be printed in binary form, padded with zeroes, then the number b should be printed with 2
digits after the decimal point, right aligned; the number c should be printed with 3 digits after the decimal point, left aligned.
 */
public class Problem_03 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        int a=console.nextInt();
        while(a>500|a<0){
            System.out.println("number a should be between 0 and 500");
            a=console.nextInt();
        }
        String padding="0000000000";
        String stringToBePadded=Integer.toBinaryString(a);
        String paddedHexidecimal=padding.substring(stringToBePadded.length())+stringToBePadded;
        double b=console.nextDouble();
        double c=console.nextDouble();
        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",Integer.toHexString(a).toUpperCase(),paddedHexidecimal,b,c);

    }
}
