import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/*
Problem 2.	ALL CAPITALS!
Write a program that reads a text file and changes the casing of all letters to upper. The file should be overwritten.
Use BufferedReader, FileReader, FileWriter, and PrintWriter.
 */
public class Problem_02 {
    public static void main(String[] args) {
        List<String> content = new ArrayList<String>();
        try (
                BufferedReader bfr =
                        new BufferedReader(
                                new FileReader("resources/lines.txt"))) {
            String line = "";
            while ((line = bfr.readLine()) != null) {
                line = line.toUpperCase();
                content.add(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (
            PrintWriter prw=
                    new PrintWriter(
                            new FileWriter(
                                    new File("resources/lines.txt")))){
            for (int i = 0; i < content.size(); i++) {
                prw.println(content.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}