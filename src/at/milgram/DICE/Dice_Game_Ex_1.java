package at.milgram.DICE;

import java.util.Random;
import java.util.Scanner;


public class Dice_Game_Ex_1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        boolean running = true;

        while (running) {
            int computer = 0;
            int player = 0;

            System.out.println("Willkommen zum Würfelspiel! Bitte wählen Sie eine Option aus: ");
            System.out.println("Taste 1 Spiel starten");


            for (int i = 1; i < 7; i++) {
                if (scanner.nextInt() == 1) {
                    int diceComputer = random.nextInt(1, 7);
                    int dicePlayer = random.nextInt(1, 7);

                    computer += diceComputer;
                    player += dicePlayer;

                    System.out.println("Der Computer hat: " + diceComputer + " gewürfelt.");
                    System.out.println("Du hast " + dicePlayer + " gewürfelt.");
                }
            }


            if (player > computer) {
                int newSumPlayer = player - computer;
                System.out.println(" ");
                System.out.println("Du hast um " + newSumPlayer + " Punkte gewonnen");
            } else if (computer > player) {
                int newSumComputer = computer - player;
                System.out.println(" ");
                System.out.println("Du hast um " + newSumComputer + " Punkte verloren");
            } else if (computer == player) {
                int newSumPlayerComputer = computer;
                System.out.println(" ");
                System.out.println("Unentschieden! Punkteanzahl: " + newSumPlayerComputer);
            }
            running = false;
        }
    }
}
