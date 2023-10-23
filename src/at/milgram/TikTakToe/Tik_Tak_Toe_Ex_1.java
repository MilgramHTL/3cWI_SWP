package at.milgram.TikTakToe;

import java.util.Scanner;

public class Tik_Tak_Toe_Ex_1 {

    static char[][] charArray;
    static char currentPlayer;

    static char checkWin() {
        for (int a = 0; a < 3; a++) {

            if (charArray[a][0] == charArray[a][1] && charArray[a][1] == charArray[a][2] && charArray[a][0] != ' ') {
                return charArray[a][0];
            }

            if (charArray[0][a] == charArray[1][a] && charArray[1][a] == charArray[2][a] && charArray[0][a] != ' ') {
                return charArray[0][a];
            }
        }


        if (charArray[0][0] == charArray[1][1] && charArray[1][1] == charArray[2][2] && charArray[0][0] != ' ') {
            return charArray[0][0];
        }
        if (charArray[0][2] == charArray[1][1] && charArray[1][1] == charArray[2][0] && charArray[0][2] != ' ') {
            return charArray[0][2];
        }

        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                if (charArray[a][b] == ' ') {
                    return ' ';
                }
            }
        }

        return 'D';
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
                    System.out.println("Invalid input. Please enter row and column in the range 0-2.");
                    continue;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter row and column as integers.");
                in.next();
                continue;
            }

            if (charArray[rowInput][colInput] == ' ') {
                charArray[rowInput][colInput] = currentPlayer;
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

                printBoard();
                winner = checkWin();
            } else {
                System.out.println("Slot already taken. Try again.");
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
