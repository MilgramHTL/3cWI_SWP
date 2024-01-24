package at.milgram.examples.car;

public class Manufacturer {
    private String name;
    private String country;
    private double discount;
    private Car car;

    public Manufacturer(String name, String country, double discount){
        this.name = name;
        this.country = country;
        this.discount = discount;
    }

    public void discount(){
        double newPrice = car.getBasePrice() * this.discount;
        System.out.println("New price for the car: " + newPrice);
    }
}
