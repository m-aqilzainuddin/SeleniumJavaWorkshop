package workshopday2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndDisplayFileContent {
	public static void main(String[] args) {
        // Specify the path of the text file
        String filePath = "C:\\Users\\Worty Experience\\Desktop\\Message.txt";

        try (
        		FileReader readFile = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(readFile)) {

               String line;
               while ((line = bufferedReader.readLine()) != null) {
                   System.out.println(line);
               }

           } catch (IOException e) {
               System.err.println("Error reading the file: " + e.getMessage());
           }    
	}
}
