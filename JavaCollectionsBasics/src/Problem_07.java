import java.util.Scanner;

/*
Problem 7.	Count Substring Occurrences
Write a program to find how many times given string appears in given text as substring. The text is given at the first input line.
The search string is given at the second input line. The output is an integer number. Please ignore the character casing.

 */
public class Problem_07 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[] text=console.nextLine().toLowerCase().split("[^a-zA-z]+");
        String word=console.nextLine();
        int count=0;
        for (int i = 0; i < text.length; i++) {

            int j=0;
            int k=0;
            while(k<text[i].length()-1){

                if((j=text[i].indexOf(word,k))!=-1) {
                    count++;
                    k=(j+word.length())-1;
                }else{
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
