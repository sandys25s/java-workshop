import java.io.File;

public class FileHandling {

    public static void main(String[] args) {
        File file = new File("src");


        if (file.isDirectory()) {
            System.out.println("It is a directory");

            File[] files = file.listFiles();
            if (files != null && files.length > 0) {
                for (File f : files) {
                    System.out.println(f.getName());
                }
            } else {
                System.out.println("No files found in the directory.");
            }
        } else {
            System.out.println("It is not a directory.");
        }
    }
}
