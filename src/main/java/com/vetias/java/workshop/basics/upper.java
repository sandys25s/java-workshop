// Removed invalid import statement

public class upper {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Full Name in Upper Case: " + upperCaseFullName);
        System.out.println("Total characters in full name: " + upperCaseFullName.length());
        System.out.println("Total words in full name: " + upperCaseFullName.split(" ").length);
    }
}