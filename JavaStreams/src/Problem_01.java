import java.io.*;

/*
Problem 1.	Sum lines
Write a program that reads a text file and prints on the console the sum of the ASCII symbols of each of its lines.
Use BufferedReader in combination with FileReader.

 */
public class Problem_01 {
    public static void main(String[] args) {

        try (BufferedReader bfr=
                     new BufferedReader(
                             new FileReader("resources/lines.txt"));){
            String line="";
            while((line=bfr.readLine())!=null) {
                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
                System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
