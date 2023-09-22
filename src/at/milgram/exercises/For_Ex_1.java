package at.milgram.exercises;

import java.util.Random;

public class For_Ex_1 {
    public static void main(String[] args) {
        int l = 0;
        for (int i = 0; i <= 100; i++) {
            System.out.println(i+l);
            l = l + i;
        }
    }
}
