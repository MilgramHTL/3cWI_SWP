package at.milgram.structuredProgramming.exercises;
import java.util.Random;

public class While_Ex_1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;

        int sum = 0;
        while (!isFinished){
            int randomValue1 = random.nextInt(10,31);
            int randomValue2 = random.nextInt(10,31);
            System.out.println(randomValue1);
            System.out.println(randomValue2);
            sum += randomValue1 + randomValue2;
            if ((randomValue1 == 15 || randomValue2 == 15) || (randomValue1 == 25 || randomValue2 == 25)){
                isFinished = true;
            }
        }
        System.out.println(sum);
        //Summe
    }
}
