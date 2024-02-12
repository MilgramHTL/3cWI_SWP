package at.milgram.examples.car;

public class Car {
    private String color;
    private double basePrice;


    public Car(String color, double basePrice){
        this.color = color;
        this.basePrice = basePrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
