package at.milgram.structuredProgramming.TikTakToe;

import java.util.Scanner;

public class Tik_Tak_Toe_Ex_1 {

    static char[][] field;
    static char currentPlayer;

    static char checkWin() {
        for (int a = 0; a < 3; a++) {

            if (field[a][0] == field[a][1] && field[a][1] == field[a][2] && field[a][0] != ' ') {
                return field[a][0];
            }

            if (field[0][a] == field[1][a] && field[1][a] == field[2][a] && field[0][a] != ' ') {
                return field[0][a];
            }
        }


        if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] != ' ') {
            return field[0][0];
        }
        if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[0][2] != ' ') {
            return field[0][2];
        }

        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                if (field[a][b] == ' ') {
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
                System.out.print(field[row][split] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        field = new char[3][3];
        currentPlayer = 'X';
        char winner = ' ';

        for (int row = 0; row < 3; row++) {
            for (int split = 0; split < 3; split++) {
                field[row][split] = ' ';
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

            if (field[rowInput][colInput] == ' ') {
                field[rowInput][colInput] = currentPlayer;
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
