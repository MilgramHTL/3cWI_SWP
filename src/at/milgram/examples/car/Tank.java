package at.milgram.examples.car;

public class Tank {
    private double fuel;
    private double fuelConsumption;

    public Tank(double fuel, double fuelConsumption){
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
