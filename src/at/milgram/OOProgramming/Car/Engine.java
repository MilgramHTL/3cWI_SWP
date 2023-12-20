package at.milgram.OOProgramming.Car;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Engine {
    public enum TYPE {Diesel, Gasoline}
    private int horsePower;
    private TYPE gasType;
    private Tank tank;

    public Engine(int horsePower, TYPE gasType, Tank tank) {
        this.horsePower = horsePower;
        this.gasType = gasType;
        this.tank = tank;
    }
    public void driveCar(double distance) {
        double fuelUsed = distance / tank.getFuelConsumption();
        tank.setFuelConsumption(tank.getFuelConsumption());
        tank.setFuelUsed(fuelUsed);
        tank.setFuel(tank.getFuel() - fuelUsed);

        System.out.println("Treibstoffverbrauch: " + fuelUsed + " Liter");
        System.out.println("Verbleibender Kraftstoff: " + tank.getFuel() + " Liter");
    }

    public void drive(int amount){
        System.out.println("the motor is running with " + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getGasType() {
        return gasType;
    }

}
