import java.util.Scanner;

/*
Create a method that finds the average of three numbers. Read in internet about java methods.
Check the naming conventions. Invoke your method and test it.
Format the output to two digits after the decimal separator. The placeholder is %.2f
 */
public class Problem_08 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.print("a = ");
        double a=Double.parseDouble(console.nextLine());
        System.out.print("b = ");
        double b=Double.parseDouble(console.nextLine());
        System.out.print("c = ");
        double c=Double.parseDouble(console.nextLine());

        Average(a,b,c);
    }
    static void Average(double a,double b,double c){
        double avg=(a+b+c)/3.0;
        System.out.println(String.format("Avarage = %.2f",avg));

    }
}
