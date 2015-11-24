
import java.util.Scanner;

/*
Problem 7.  Ghetto Numeral System
Write a program that converts the decimal number system to the ghetto numeral system. In the ghetto, numbers are represented as following:
?	0 – Gee
?	1 – Bro
?	2 – Zuz
?	3 – Ma
?	4 – Duh
?	5  - Yo
?	6 – Dis
?	7 – Hood
?	8 – Jam
?	9 – Mack

 */
public class Problem_07 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        char[]numbers=console.nextLine().toCharArray();
        StringBuilder ghettoNums = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            char number = numbers[i];
            ghettoNums.append(FindTheNumber(number));

        }
        System.out.println(ghettoNums);
    }
    static String FindTheNumber(char number){
        String ghettoNum="";
        switch (number) {
            case '0':ghettoNum="Gee";break;
            case '1':ghettoNum="Bro";break;
            case '2':ghettoNum="Zuz";break;
            case '3':ghettoNum="Ma";break;
            case '4':ghettoNum="Duh";break;
            case '5':ghettoNum="Yo";break;
            case '6':ghettoNum="Dis";break;
            case '7':ghettoNum="Hood";break;
            case '8':ghettoNum="Jam";break;
            case '9':ghettoNum="Mack";break;
        }
        return  ghettoNum;
    }
}

