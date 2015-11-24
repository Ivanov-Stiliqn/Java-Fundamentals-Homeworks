package Problem_06;

import java.io.*;

/*
Problem 6.	*Save a Custom Object in a file
Write a program that saves and loads the information from a custom Object that you have created to a file using
ObjectInputStream, ObjectOutputStream. Create a class Course that has a String field containing the name and an integer field
containing the number of students attending the course. Set the name of the new file as course.save.

 */
public class Main {
    private static Course[] courses;
    public static void main(String[] args) {

        courses=new Course[3];
        courses[0]=new Course("Java Fundamentals",300);
        courses[1]=new Course("C# Fundamentals",400);
        courses[2]=new Course("C# Basics",1200);
        //Save();
        Load();
    }
    public static void Save(){

        try (
                ObjectOutputStream oos=
                        new ObjectOutputStream(
                                new BufferedOutputStream(
                                        new FileOutputStream("resources/problem_06/course.save")))){
            for(Course c: courses){

                oos.writeObject(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void Load(){
        try (
                ObjectInputStream ois=
                        new ObjectInputStream(
                                new BufferedInputStream(
                                        new FileInputStream("resources/problem_06/course.save")))){
            Object obj;
            while((obj=ois.readObject())!=null){
                System.out.println("Course: "+obj);
            }

        }catch (EOFException eof){
            System.out.println("End of File");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
