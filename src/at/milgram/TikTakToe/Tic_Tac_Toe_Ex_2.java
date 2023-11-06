package at.milgram.TikTakToe;

import java.util.Scanner;

public class Tic_Tac_Toe_Ex_2 {
    static int[][] field = new int[3][3];
    static Scanner scanner = new Scanner(System.in);
    static boolean isPlayer = true;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        while (true) {
            System.out.println("If you want to play write in this format for row and column: 0,0 to 2,2!");
            if (isPlayer) {
                System.out.println("Player 1");
            } else {
                System.out.println("Player 2");
            }

            String inputOfPlayer = scanner.next();
            String[] input = inputOfPlayer.split(",");
            int input1 = Integer.parseInt(input[0]);
            int input2 = Integer.parseInt(input[1]);

            if (isValidMove(input1, input2)) {
                if (isPlayer) {
                    field[input1][input2] = 1;
                } else {
                    field[input1][input2] = 2;
                }

                printBoard();

                if (isWinner()) {
                    System.out.println("Player " + (isPlayer ? "1" : "2") + " wins!");
                    break;
                } else if (isBoardFull()) {
                    System.out.println("It's a draw!");
                    break;
                }

                isPlayer = !isPlayer;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] == 0 ? " " : (field[i][j] == 1 ? "X" : "O"));
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-----");
            }
        }
    }

    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && field[row][col] == 0;
    }

    public static boolean isWinner() {

        for (int i = 0; i < 3; i++) {
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][0] != 0) {
                return true;
            }
            if (field[0][i] == field[1][i] && field[1][i] == field[2][i] && field[0][i] != 0) {
                return true;
            }
        }
        if ((field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] != 0) ||
                (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[0][2] != 0)) {
            return true;
        }
        return false;
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
