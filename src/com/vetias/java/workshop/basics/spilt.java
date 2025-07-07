public class spilt {
    public static final String[] Word = null;

    public static void main(String[] args) {
        String sentence = "this is a program shows how to convert a string to upper case";
        String[] word = sentence.split(" ");
        for (String w : word) {
            String upperCaseWord = w.toUpperCase();
            System.out.println((upperCaseWord));
        }
    }
}
