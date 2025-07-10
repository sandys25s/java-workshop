import java.util.Scanner;

public class Namegenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter youR age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your gender(male/female):");
        String gender = scanner.nextLine().trim().toLowerCase();
        String title;
        if(gender.equals(null))
        {
            title = "Mr.";
        } else
        {
            title = "Ms.";
        }   
        System.out.println("\nOutput:");
        System.out.println("Hello " + title + " " + firstName + ", you are " + age + " years old.");

        scanner.close();
    }
}
