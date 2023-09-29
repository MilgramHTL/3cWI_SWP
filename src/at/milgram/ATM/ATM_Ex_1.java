package at.milgram.ATM;

import java.util.Scanner;

public class ATM_Ex_1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        printInfo();
        boolean isRunning = true;
        double bankBalance = 0;

        while (isRunning == true){

            switch(scanner.nextInt()) {
                case 1:
                    System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten: ");
                    double amountOne = scanner.nextDouble();
                    bankBalance += amountOne;
                    System.out.println("Sie haben " + amountOne + " Euro eingezahlt!");
                    break;
                case 2:
                    System.out.println("Wie viel würden Sie gerne abheben?");
                    double amountTwo = scanner.nextDouble();
                    bankBalance -= amountTwo;
                    System.out.println("Sie haben " + amountTwo + " Euro abgehoben");
                    break;
                case 3:
                    System.out.println("Der Kontostand beträgt " + bankBalance + " Euro");
                    break;
                case 4:
                    System.out.println("Machine is stopping!");
                    isRunning = false;
                    break;
            }
        }
    }
    public static void printInfo(){
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Ende");
    }
}
