package at.milgram.OOProgramming.Car;

public class Tank {
    private double capacity;
    private double fuelConsumption;
    private String material;
    private double fuelUsed;
    private double distance;
    private double fuel;
    private double remainingDistance;


    public Tank(double capacity, double fuelConsumption, String material) {
        this.capacity = capacity;
        this.fuelConsumption = fuelConsumption;
        this.material = material;
        this.fuelUsed = 30;
    }

    public void getRemainingRange(){
        this.remainingDistance = this.fuel/this.fuelConsumption;
        System.out.println("Das Fahrzeug könnte noch: " + this.remainingDistance + " fahren.");
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getFuelUsed() {
        return fuelUsed;
    }

    public void setFuelUsed(double fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        fuel = fuel;
    }
}
