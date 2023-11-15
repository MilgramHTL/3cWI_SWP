package at.milgram.OOProgramming.Car;

public class Car_Execute {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "red";
        c1.fuel = 69;
        c1.fuelConsumption = 3;
        c1.serialNumber = "R8";

        Car c2 = new Car();
        c2.color = "blue";
        c2.fuel = 64;
        c2.fuelConsumption = 2;
        c2.serialNumber = "A5";

        c1.driveCar(c1.color, c1.fuel, c1.fuelConsumption, c1.serialNumber);
        c1.turboBoost();
        c1.honk();
        c1.brakeCar();
        c1.getRemainingRange();

        c2.driveCar(c2.color, c2.fuel, c2.fuelConsumption, c2.serialNumber);
        c2.turboBoost();
        c2.honk();
        c2.brakeCar();
        c2.getRemainingRange();
    }
}
