import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Get First Odd or Even Elements
Write a method that returns the first N odd/even elements from a collection. Return as many as you can

 */
public class Problem_13 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[] collection=console.nextLine().split(" ");
        String[] commands=console.nextLine().split(" ");
        int count=Integer.parseInt(commands[1]);
        String oddOrEven=commands[2];
        getFirstNNumbers(collection,count,oddOrEven);
    }
    public static void getFirstNNumbers(String[]collection,int count,String oddOrEven) {

        if(oddOrEven.equals("even")){
            Even(collection,count);
        }else{
            Odd(collection,count);
        }
    }
    public static void Even(String[]collection,int count){

        List<Integer> evens=new ArrayList<Integer>();
        for (int i = 0; i < collection.length; i++) {
            int num=Integer.parseInt(collection[i]);
            if(num%2==0){
                evens.add(num);
            }
        }
        if(count>evens.size()) {
            count = evens.size();
        }
        for (int i = 0; i < count; i++) {
            System.out.print(evens.get(i)+" ");
        }
    }
    public static void Odd(String[]collection,int count){

        List<Integer> odds=new ArrayList<Integer>();
        for (int i = 0; i < collection.length; i++) {
            int num=Integer.parseInt(collection[i]);
            if(num%2!=0){
                odds.add(num);
            }
        }
        if(count>odds.size()) {
            count = odds.size();
        }
        for (int i = 0; i < count; i++) {
            System.out.print(odds.get(i) + " ");
        }
    }
}


