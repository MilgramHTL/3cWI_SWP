package at.milgram.examples.car;

public class Car {
    private String color;
    private double basePrice;
    private Engine engine;
    private Tank tank;


    public Car(Engine engine, Tank tank, String color, double basePrice){
        this.engine = engine;
        this.tank = tank;
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
