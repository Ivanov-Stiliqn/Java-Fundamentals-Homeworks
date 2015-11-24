import java.util.Scanner;

/*
Problem 16  Calculate N!
Write a program that recursively calculates factorial.

 */
public class Problem_16 {
    public static long sum;
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        sum=1;
        long num=Long.parseLong(console.nextLine());
        if(num>0) {
            Facturel(num);
        }
        System.out.println(sum);

    }
    public static long Facturel(long num){

        sum*=num;
        num--;
        if(num==0){
            return sum;
        }
        return Facturel(num);
    }
}
