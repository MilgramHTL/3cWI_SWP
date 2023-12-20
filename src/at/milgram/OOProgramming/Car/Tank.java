package at.milgram.OOProgramming.Car;

public class Tank {
    private double capacity;

    private String material;


    private double fuelAmount;


    public Tank(double capacity, double fuelConsumption, String material) {
        this.capacity = capacity;
        this.fuelAmount = capacity;
        this.material = material;

    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
}

