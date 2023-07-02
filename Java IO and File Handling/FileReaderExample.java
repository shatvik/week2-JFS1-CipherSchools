import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Shatvik Pandey\\Desktop\\SEM6\\JFS1\\week2";  // Specify the file path here

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);  // Print each line to the console
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
