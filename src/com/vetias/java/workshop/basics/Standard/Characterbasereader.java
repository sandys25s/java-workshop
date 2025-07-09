package Standard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Characterbasereader {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("src/com/vetias/java/workshop/basics"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("reading file failed:");
            e.printStackTrace();
        }
    }
}
