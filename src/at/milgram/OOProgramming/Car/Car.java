package at.milgram.OOProgramming.Car;

import java.util.Scanner;


public class Car {
    private String color;
    private double fuel;
    private double fuelConsumption;
    private String serialNumber;
    private double distance;
    private double remainingDistance;
    private double fuelUsed;
    private Scanner scanner;
    private int amountOfRepetitions;
    private double fuelCheck;
    private Engine engine;
    public Car(Engine engine, String color, double fuel, double fuelConsumption, String serialNumber) {
        this.engine = engine;
        this.color = color;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.serialNumber = serialNumber;
        this.distance = 0.0;
    }


    public void driveCar() {
        System.out.println("Das Auto mit der Farbe " + this.color + ", Seriennummer " + this.serialNumber + " und PS von " + this.getEngine().getHorsePower() + " fährt.");
        System.out.println("Wie weit soll das Auto fahren: ");
        Scanner scanner = new Scanner(System.in);
        this.distance = scanner.nextDouble();
        this.fuelUsed = this.distance / this.fuelConsumption;
        this.fuel -= this.fuelUsed;

        System.out.println("Treibstoffverbrauch: " + this.fuelUsed + " Liter");
        System.out.println("Verbleibender Kraftstoff: " + this.fuel + " Liter");
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
    public void getRemainingRange(){
        this.remainingDistance = this.fuel/this.fuelConsumption;
        System.out.println("Das Fahrzeug könnte noch: " + this.remainingDistance + " fahren.");
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

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelCheck(double fuelCheck) {
        this.fuelCheck = fuelCheck;
    }

    public void setFuelUsed(double fuelUsed) {
        this.fuelUsed = fuelUsed;
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

    public double getFuelConsumption() {
        return fuelConsumption;
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

    public double getFuelUsed() {
        return fuelUsed;
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

