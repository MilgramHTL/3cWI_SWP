package at.milgram.examples.regularExpressions;

public class regex101 {
    public static void main(String[] args) {
        String email = "lukas.wagner@gmail.com";

        if (email.matches(".*@.*\\.[a-zA-Z]{2,4}")){
            System.out.println("true");
        } else
            System.out.println("false");
    }
}
