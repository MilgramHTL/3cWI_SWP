package at.milgram.TikTakToe;

import java.util.Scanner;

public class Tik_Tak_Toe_Ex_1 {
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        char [][] charArray = new char[3][3];
        String splitChar = " | ";
        String rowChar = " ------- ";
        char X = (char)88;
        char O = (char)79;

        for (int row = 0; row < 3; row++) {
            for (int split = 0; split < 3; split++) {
                charArray [row] [split] = ' ';
            }
        }

        for (int row = 0; row < 3; row++) {
            for (int split = 0; split < 3; split++) {
                System.out.print(charArray[row][split]);
                    if (split < 2) {
                        System.out.print(splitChar);
                    }
                }
                System.out.println();
                if (row < 2){
                    System.out.println(rowChar);
                }
        }
    }
}
