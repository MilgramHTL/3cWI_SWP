package at.milgram.TikTakToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tik_Tak_Toe_Ex_1 {

    static char[][] charArray;
    static char currentPlayer;

    static char checkWin() {
        for (int a = 0; a < 8; a++) {
            char line = ' ';

            switch (a) {
                case 0:
                    line = charArray[0][0];
                    break;
                case 1:
                    line = charArray[0][1];
                    break;
                case 2:
                    line = charArray[0][2];
                    break;
                case 3:
                    line = charArray[0][0];
                    break;
                case 4:
                    line = charArray[1][1];
                    break;
                case 5:
                    line = charArray[2][2];
                    break;
                case 6:
                    line = charArray[2][0];
                    break;
                case 7:
                    line = charArray[2][2];
                    break;
            }
            if (line == 'X') {
                return 'X';
            } else if (line == 'O') {
                return 'O';
            }
        }

        for (int a = 0; a < 9; a++) {
            if (charArray[a / 3][a % 3] != 'X' && charArray[a / 3][a % 3] != 'O') {
                break;
            } else if (a == 8) {
                return 'D';
            }
        }

        return ' ';
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int split = 0; split < 3; split++) {
                System.out.print(charArray[row][split] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        charArray = new char[3][3];
        currentPlayer = 'X';
        char winner = ' ';

        for (int row = 0; row < 3; row++) {
            for (int split = 0; split < 3; split++) {
                charArray[row][split] = ' ';
            }
        }

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();

        System.out.println("X will play first. Enter row (0-2) and column (0-2):");

        while (winner == ' ') {
            int rowInput, colInput;

            try {
                rowInput = in.nextInt();
                colInput = in.nextInt();
                if (!(rowInput >= 0 && rowInput < 3 && colInput >= 0 && colInput < 3)) {
                    System.out.println("Invalid input");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                in.next();
                continue;
            }

            if (charArray[rowInput][colInput] == ' ') {
                charArray[rowInput][colInput] = currentPlayer;
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

                printBoard();
                winner = checkWin();
            } else {
                System.out.println("Slot already taken");
            }
        }

        if (winner == 'D') {
            System.out.println("It's a draw!");
        } else {
            System.out.println("Congratulations! " + winner + " has won!");
        }
        in.close();
    }
}
