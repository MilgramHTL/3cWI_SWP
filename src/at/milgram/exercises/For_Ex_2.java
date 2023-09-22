package at.milgram.exercises;

public class For_Ex_2 {
    public static void main(String[] args) {
        int l = 0;
        for (int i = 2; i <= 1000; i = i + 2) {
            System.out.println(i + l);
            l = l + i;
        }
    }
}
