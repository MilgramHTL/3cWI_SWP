package at.milgram.structuredProgramming.helper;

import java.util.Scanner;

public class String_Helper_Ex_Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversed = reverseString(inputString);
        System.out.println("Reversed String: " + reversed);

        if (isPalindrome(inputString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        int letterCount = countLetters(inputString, 'C');
        System.out.println("Count of 'C': " + letterCount);

        System.out.println("Amount of Letters:");
        printAmountOfLetters(inputString);
    }

    public static boolean isPalindrome(String string) {
        String cleanString = string.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int length = cleanString.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanString.charAt(i) != cleanString.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int countLetters(String string, char character) {
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c == character) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String string) {
        StringBuilder reversed = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }
        return reversed.toString();
    }

    public static void printAmountOfLetters(String string) {
        int[] letterCounts = new int[26];
        string = string.toUpperCase();

        for (char c : string.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                int index = c - 'A';
                letterCounts[index]++;
            }
        }

        for (int i = 0; i < letterCounts.length; i++) {
            if (letterCounts[i] > 0) {
                char letter = (char) ('A' + i);
                System.out.println(letter + " - " + letterCounts[i]);
            }
        }
    }
}
