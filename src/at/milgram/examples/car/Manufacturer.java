package at.milgram.examples.car;

public class Manufacturer {
    private String name;
    private String country;
    private double discount;
    private Car car;

    public Manufacturer(Car car, String name, String country, double discount){
        this.car = car;
        this.name = name;
        this.country = country;
        this.discount = discount;
    }

    public void discount(){
        double newPrice = car.getBasePrice() * this.discount;
        System.out.println("New price for the car: " + newPrice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
