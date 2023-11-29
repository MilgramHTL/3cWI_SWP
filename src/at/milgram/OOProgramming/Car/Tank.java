package at.milgram.OOProgramming.Car;

public class Tank {
    private double capacity;
    private double fuelConsumption;
    private String material;

    public Tank(double capacity, double fuelConsumption, String material) {
        this.capacity = capacity;
        this.fuelConsumption = fuelConsumption;
        this.material = material;
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
}
