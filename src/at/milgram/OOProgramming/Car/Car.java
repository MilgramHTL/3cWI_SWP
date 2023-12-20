package at.milgram.OOProgramming.Car;

import java.util.Scanner;


public class Car {
    private String color;
    private double fuel;
    private String serialNumber;
    private double distance;
    private double remainingDistance;
    private Scanner scanner;
    private int amountOfRepetitions;
    private double fuelCheck;
    private Engine engine;
    public Car(Engine engine, String color, double fuel, String serialNumber) {
        this.engine = engine;
        this.color = color;
        this.fuel = fuel;
        this.serialNumber = serialNumber;
        this.distance = 0.0;
    }

    public void turboBoost(){
        double boostFuel = 4;
        if (this.fuel >= boostFuel) {
            this.fuel -= boostFuel;
            System.out.println("SuperBoost-Modus");
            System.out.println("Treibstoff nach Benutzung des SuperBoost-Modus: " + this.fuel + " Liter");
        } else {
            System.out.println("Not enough fuel to use Superboost");
        }
    }
    public void honk(){
        System.out.println("Anzahl der Huper: ");
        this.scanner = new Scanner(System.in);
        this.amountOfRepetitions = Integer.parseInt(this.scanner.next());
        for(int i = 0; i < this.amountOfRepetitions; i++) {
            System.out.println("Tuuuuuuut");
        }
    }

    public void drive(int amount){

        this.engine.drive(amount);
    }

    public void checkFuel(){
        this.fuelCheck = this.fuel;
        if(this.fuelCheck > 0){
            System.out.println("Das Auto hat noch Treibsstoff.");
        }else {
            System.out.println("Das Auto hat keinen Treibstoff mehr.");
        }
    }
    public void brakeCar() {
        System.out.println("Das Auto bremst.");
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDistance(double distance) {
        if (distance > 90){
            this.distance = 90;
        } else{
            this.distance = distance;
        }
    }

    public void setRemainingDistance(double remainingDistance) {
        this.remainingDistance = remainingDistance;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public double getFuel() {
        return fuel;
    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public double getDistance() {
        return distance;
    }

    public double getRemainingDistance() {
        return remainingDistance;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }

    public double getFuelCheck() {
        return fuelCheck;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

