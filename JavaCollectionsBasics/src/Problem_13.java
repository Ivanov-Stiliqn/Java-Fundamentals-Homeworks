import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Filter Array
Write a program that filters an array of strings, leaving only the strings with length greater than 3 characters. Use .filter()

 */
public class Problem_13 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[] text=console.nextLine().split(" ");
        List<String> words=new ArrayList<>();
        for (int i = 0; i < text.length; i++) {
            words.add(text[i]);
        }
        Object[]output= words.stream().filter(w->w.length()>3).toArray();
        if(output.length<1){
            System.out.println("(empty)");
        }else {
            for (Object o : output) {
                System.out.print(o + " ");
            }
        }
    }
}
