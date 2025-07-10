import java.util.StringTokenizer;

public class Stringtokenizer {
    public static void main(String[] args) {
        String str = "Hello, how are you doing today?";
        StringTokenizer tokenizer = new StringTokenizer(str, " ,?");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
