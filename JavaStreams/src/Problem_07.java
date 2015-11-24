import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/*
Problem 7.	*Create Zip Archive
Write a program that reads three txt files words.txt, count-chars.txt and lines.txt and create a zip archive named text-files.zip.
Use FileOutputStream, ZipOutputStream, and FileInputStream.

 */
public class Problem_07 {
    public static void main(String[] args) {

        try (
            ZipOutputStream zos=
                    new ZipOutputStream(
                            new FileOutputStream(
                                    new File("resources/problem_07/text-files.zip")))){
            String file1="resources/problem_03/words.txt";
            String file2="resources/problem_03/count-chars.txt";
            String file3="resources/lines.txt";
            Zipping(zos,file1);
            Zipping(zos,file2);
            Zipping(zos,file3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void Zipping(ZipOutputStream zos,String file) throws IOException {

        FileInputStream fis=new FileInputStream(file);
        ZipEntry zipEntry=new ZipEntry(file);
        zos.putNextEntry(zipEntry);

        byte[] buffer=new byte[4096];
        int lenght=0;
        while((lenght=fis.read(buffer))>-1){
            zos.write(buffer,0,lenght);
        }

        zos.closeEntry();
    }
}
