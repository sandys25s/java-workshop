import java.util.Scanner;
public class Agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthyear;
        System.out.print("Enter your birth year: ");
        birthyear = scanner.nextInt();
        int currentyear = 2025;
        int Age = currentyear - birthyear;
        System.out.println("Your age is: " + Age);
        scanner.close();
    }
}
