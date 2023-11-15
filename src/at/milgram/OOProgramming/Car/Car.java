package at.milgram.OOProgramming.Car;

public class Car {
    public String color;
    public double fuel;
    public double fuelConsumption;
    public String serialNumber;

    public void driveCar(String color, double fuel, double fuelConsumption, String serialNumber) {
        System.out.println("Das Auto mit der Farbe " + color + ", Seriennummer " + serialNumber + " fährt.");

        double distance = 120.0;
        double fuelUsed = distance / fuelConsumption;
        fuel -= fuelUsed;

        System.out.println("Treibstoffverbrauch: " + fuelUsed + " Liter");
        System.out.println("Verbleibender Kraftstoff: " + fuel + " Liter");
    }

    public void brakeCar() {
        System.out.println("Das Auto bremst.");
    }

    public static void turboBoost(){

    }
}
