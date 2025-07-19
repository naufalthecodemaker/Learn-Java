import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Chap58WriteFiles {
    public static void main(String[] args){
        // how to write a file using Java (4 popular options)
        /*
            FileWriter = good for small or medium-sized text files
            BufferedWriter = better performance for large amounts of text
            PrintWriter = best for structured data, like reports or logs
            FileOutputStream = best for binary files (image, audio files)
         */

        String filePath = "C:\\Users\\Naufal Rahman\\Desktop\\test.txt";
        String textContent = "I love jawa! Jawa is key!";

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been writen");
        } catch (FileNotFoundException e){
            System.out.println("Couldn't locate file location");
        } catch (IOException e){
            System.out.println("Couldn't write file");
        }
    }
}
