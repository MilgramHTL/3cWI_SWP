package at.milgram.structuredProgramming.exercises;

import java.util.Random;

public class Switch_Ex_1 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int randomNumber = random.nextInt(5,11);
        // Wenn der Wert 10 ist gib aus Ten
        switch (randomNumber) {
            case 5:
                System.out.println("Number is 5");
                break;
            case 6:
                System.out.println("Number is 6");
                break;
            case 7:
                System.out.println("Number is 7");
                break;
            case 8:
                System.out.println("Number is 8");
                break;
            case 9:
                System.out.println("Number is 9");
                break;
            case 10:
                System.out.println("Number is 10");
                break;
        }
        // Wenn der Wert 9 ist gib aus Nine

        // Wenn der Wert 8 ist gib aus Eight
        // etc.

    }
}
