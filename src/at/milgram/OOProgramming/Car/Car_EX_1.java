package at.milgram.OOProgramming.Car;

public class Car_EX_1 {
    public static void main(String[] args) {
        String car1Color = "red";
        double car1Fuel = 69;
        double car1FuelConsumption = 3;
        String car1SerialNumber = "R8";

        String car2Color = "blue";
        double car2Fuel = 64;
        double car2FuelConsumption = 2;
        String car2SerialNumber = "A5";

        driveCar(car1Color, car1SerialNumber, car1Fuel, car1FuelConsumption);
        brakeCar();

        driveCar(car2Color, car2SerialNumber, car2Fuel, car2FuelConsumption);
        brakeCar();
    }
    public static void driveCar(String color, String serialNumber, double fuel, double fuelConsumption) {
        System.out.println("Das Auto mit der Farbe " + color + ", Seriennummer " + serialNumber + " fährt.");

        double distance = 120.0;
        double fuelUsed = distance / fuelConsumption;
        fuel -= fuelUsed;

        System.out.println("Treibstoffverbrauch: " + fuelUsed + " Liter");
        System.out.println("Verbleibender Kraftstoff: " + fuel + " Liter");
    }

    public static void brakeCar() {
        System.out.println("Das Auto bremst.");
    }
}
