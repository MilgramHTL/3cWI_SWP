package at.milgram.caesar.encrypten;

public class Caesar_Ex_1 {
    public static void main(String[] args) {
        String word = "Hello world";
        System.out.println("Normal word: " + word);
        String encryptedWord = encrypt(word, 2);
        System.out.println("Encrypted word: " + encryptedWord);
        String decryptedWord = decrypt(encryptedWord, 2);
        System.out.println("Decrypted word: " + decryptedWord);
    }

    public static String encrypt(String string, int offset) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);

            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                char encryptedLetter = (char) (base + (character - base + offset) % 26);
                output.append(encryptedLetter);
            } else {
                output.append(character);
            }
        }

        return output.toString();
    }

    public static String decrypt(String string, int offset) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);

            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                char decryptedLetter = (char) (base + (character - base - offset + 26) % 26);
                output.append(decryptedLetter);
            } else {
                output.append(character);
            }
        }
        return output.toString();
    }
}
