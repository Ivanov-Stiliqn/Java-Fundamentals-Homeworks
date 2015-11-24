import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Problem 14  Sort array with stream API
Use the .sorted() method to sort an array of integers. The first line of input is the array. The second is the sorting order.

*/
public class Problem_14 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        List<Integer>numbers=new ArrayList<>();
        Object[]output=new Object[numbers.size()];
        String[] input=console.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        String command=console.nextLine();

        if(!command.equals("Ascending")){

            output=numbers.stream().sorted((a,b)->b - a).toArray();
        }else{
            output=numbers.stream().sorted().toArray();
        }
        for (Object number : output) {
            System.out.print(number+" ");
        }
    }
}
