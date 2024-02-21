package at.milgram.example.calculators;

public class Main {
    public static void main(String[] args) {
        BaseCalculator b1 = new BaseCalculator(2.5,25.5);
        RootCalculator r1 = new RootCalculator(25,20,2);
        ScientificCalculator s1 = new ScientificCalculator(20, 30);
        b1.addition();
        b1.division();
        r1.root();
        s1.sinus();
        s1.cosinus();
    }
}
