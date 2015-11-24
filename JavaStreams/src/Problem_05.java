import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Problem 5.	Save an ArrayList of doubles
Write a program that saves and loads the information from an ArrayList to a file using ObjectInputStream, ObjectOutputStream.
Set the name of the new file as doubles.list

 */
public class Problem_05 {
    public static void main(String[] args) {

        List<Double> doubles=new ArrayList<Double>();
        doubles.add(5.3);
        doubles.add(5.33);
        doubles.add(5.333);
        doubles.add(5.3333);
        //Save(doubles);
        Load();

    }
    public static void Save(List<Double> doubles){

        try (
                ObjectOutputStream oos=
                        new ObjectOutputStream(
                                new BufferedOutputStream(
                                        new FileOutputStream("resources/problem_05/doubles.list")))){
            oos.writeObject(doubles);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void Load(){
        try (
                ObjectInputStream ois=
                        new ObjectInputStream(
                                new BufferedInputStream(
                                        new FileInputStream("resources/problem_05/doubles.list")))){
            System.out.println(ois.readObject());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
