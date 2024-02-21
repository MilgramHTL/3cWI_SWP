package at.milgram.example.calculators;

public class RootCalculator extends BaseCalculator{
    private int rootOf;
    public RootCalculator(double num1, double num2, int rootOf) {
        super(num1, num2);
        this.rootOf = rootOf;
    }

    @Override
    public void addition() {
        super.addition();
    }

    @Override
    public void substraction() {
        super.substraction();
    }

    @Override
    public void multiplication() {
        super.multiplication();
    }

    @Override
    public void division() {
        super.division();
    }

    public void root(){
        double root = 0;
        root = Math.pow(getNum1(), 1.0/rootOf);
        System.out.println(root);
    }
}
