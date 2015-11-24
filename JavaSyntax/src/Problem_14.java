import java.util.Scanner;

/*
Problem 14  Magic exchangeable words
Write a method that takes as input two strings of equal length, and returns Boolean if they are exchangeable or not.
Exchangeable are words where the characters in the first string can be replaced to get the second string
 */
public class Problem_14 {
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[]words=console.nextLine().split(" ");
        String first=words[0];
        String second=words[1];
        System.out.println(Magic(first,second));

    }
    public static boolean Magic(String first,String second){
        int flag=0;
        for (int i = 0; i < first.length(); i++) {
            char character=first.charAt(i);
            char magicCharacter=second.charAt(i);
            for (int j = 0; j <first.length() ; j++) {
                char currentCharacter=first.charAt(j);
                char currentMagicCharacter=second.charAt(j);
                if(currentCharacter==character&&currentMagicCharacter!=magicCharacter){
                    flag=1;
                }
            }
        }
        if(flag==0) {
            return true;
        }else {
            return false;
        }
    }
}
