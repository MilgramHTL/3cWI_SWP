package at.milgram.structuredProgramming.exercises;

import java.util.Random;

public class IF_Ex_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println(randomNumber);

        if(randomNumber < 20) {
            System.out.println("Mini");
        } else if (randomNumber > 20 && randomNumber < 50) {
            System.out.println("Medium");
        } else if (50 < randomNumber) {
            System.out.println("Large");
        }
        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        // Wenn die Zahl größer als 50 ist gib aus "Large"

    }
}
