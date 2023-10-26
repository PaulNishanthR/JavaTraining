package K_File;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileClass {
    public static void main(String[] args) {
        String fileName="src/K_File/dummy.txt";
        BufferedReader bufferedReader;
        try{
            bufferedReader=new BufferedReader(new FileReader(fileName));
            String currentLine=bufferedReader.readLine();
            System.out.println(currentLine);
            bufferedReader.close();
        }catch (IIOException iioException){

        }
    }
}
