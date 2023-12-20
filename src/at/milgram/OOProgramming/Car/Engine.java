package at.milgram.OOProgramming.Car;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Engine {
    public enum TYPE {Diesel, Gasoline}
    private int horsePower;
    private TYPE gasType;
    private Tank tank;
    private int fuelConsumption;

    public Engine(int horsePower, TYPE gasType, Tank tank) {
        this.horsePower = horsePower;
        this.gasType = gasType;
        this.tank = tank;
    }

    public void drive(int amount, int speed){
        System.out.println("The motor is running with " + this.tank.getFuelAmount());
        this.tank.setFuelAmount(this.tank.getFuelAmount()-amount);
        System.out.println("The motor is running with " + this.tank.getFuelAmount());
        System.out.println("The car drives with the speed of: " + speed);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getGasType() {
        return gasType;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }
}
