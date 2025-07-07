// Removed invalid import statement

public class upper {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Full Name in Upper Case: " + upperCaseFullName);

        String sentence ="this is a program shows how to convert a string to upper case";
        String[] words = sentence.split(" ");
        for (String word : words) {
            String upperCaseWord = word.toUpperCase();
            System.out.println(upperCaseWord);
        }
    }
}
