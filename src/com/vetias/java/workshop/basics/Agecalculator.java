import java.time.LocalDate;
import java.util.Scanner;
public class Agecalculator {
    public static <localDate> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthyear;
        System.out.print("Enter your birth year: ");
        birthyear = scanner.nextInt();
        int currentyear = 2025;
        int Age = currentyear - birthyear;
        System.out.println("Your age is: " + Age);


        System.out.println("enter your month of birth (1-12): ");
        String datebrith = scanner.next();
        LocalDate today = LocalDate.parse(datebrith);
        int yearbrith = today.getYear();
        int currentYearNow = LocalDate.now().getYear();
        int age = currentYearNow - yearbrith;
        System.out.println("Your age is: " + age + " years");
        scanner.close();
    }
}
