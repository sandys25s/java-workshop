public class spilt {
    public static final String[] Word = null;

    public static void main(String[] args) {
        String sentence = "this is a program shows how to convert a string to upper case";
        String[] sentences = sentence.split("\\.");
        System.out.println("total sentences: " + sentences.length);
        String[] words = sentence.split(" ");
        System.out.println("total words: " + words.length);
        String[] chars = sentence.split("");
        System.out.println("total characters: " + chars.length);
    }
}