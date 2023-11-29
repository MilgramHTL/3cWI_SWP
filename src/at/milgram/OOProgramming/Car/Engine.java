package at.milgram.OOProgramming.Car;

import org.w3c.dom.ls.LSOutput;

public class Engine {
    public enum TYPE {Diesel, Gasoline}
    private int horsePower;
    private TYPE gasType;

    public Engine(int horsePower, TYPE gasType) {
        this.horsePower = horsePower;
        this.gasType = gasType;
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
