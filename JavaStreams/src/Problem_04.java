import java.io.*;

/*
Problem 4.	Copy .jpg File
Write a program that copies the contents of a .jpg file to another using FileInputStream, FileOutputStream, and byte[] buffer.
Set the name of the new file as my-copied-picture.jpg.

 */
public class Problem_04 {
    public static void main(String[] args) {

        try (
                FileInputStream fis=
                        new FileInputStream("resources/problem_04/my-picture.jpg");
                FileOutputStream fos=
                        new FileOutputStream("resources/problem_04/copy-my-picture.jpg")){
            byte[] buffer=new byte[4096];
            int lenght;
            while((lenght=fis.read(buffer))>0){
                fos.write(buffer,0,lenght);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
