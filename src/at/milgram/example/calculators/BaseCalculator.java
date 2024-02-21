package at.milgram.example.calculators;

public class BaseCalculator {
    private double num1;
    private double num2;

    public BaseCalculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addition(){
        double sum = 0;
        sum = num1 + num2;
        System.out.println(sum);
    }

    public void substraction(){
        double differenz = 0;
        differenz = num2 - num1;
        System.out.println(differenz);
    }

    public void multiplication(){
        double product = 0;
        product = num1 * num2;
        System.out.println(product);
    }
    public void division(){
        double quotient = 0;
        quotient = num2/num1;
        System.out.println(quotient);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
