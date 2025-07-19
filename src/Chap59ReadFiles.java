import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Chap59ReadFiles {
    public static void main(String[] args){
        /*
            How to read a file using Java (3 popular options)
            1. BufferedReader + FileReader = best for reading text files line-by-line
            2. FileInputStream = best for binary files (images, audio files)
            3. RandomAccessFile = best for read/write specific portions of a large files
         */

        String filePath = "C:\\Users\\Naufal Rahman\\Desktop\\test1.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            // read a file
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("Couldn't locate file!");
        } catch (IOException e){ // SAFETY NET
            System.out.println("Something went wrong!");
        }
    }
}
