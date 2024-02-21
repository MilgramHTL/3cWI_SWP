package at.milgram.example.calculators;

public class ScientificCalculator extends BaseCalculator{
    public ScientificCalculator(double num1, double num2) {
        super(num1, num2);
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

    public void sinus(){
        double sin = 0;
        sin = Math.sin(getNum1());
        System.out.println(sin);
    }

    public void cosinus(){
        double cos = 0;
        cos = Math.cos(getNum2());
        System.out.println(cos);
    }
}
