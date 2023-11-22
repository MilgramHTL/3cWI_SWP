package at.milgram.OOProgramming.Car;

import java.util.Scanner;

public class Car {
    public String color;
    public double fuel;
    public double fuelConsumption;
    public String serialNumber;
    public double distance;
    public double remainingDistance;
    public double fuelUsed;
    public Scanner scanner;
    public int amountOfRepetitions;
    public double fuelCheck;
    public Car(String color, double fuel, double fuelConsumption, String serialNumber) {
        this.color = color;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.serialNumber = serialNumber;
        this.distance = 0.0;
    }


    public void driveCar() {
        System.out.println("Das Auto mit der Farbe " + this.color + ", Seriennummer " + this.serialNumber + " fährt.");

        this.distance = 90.0;
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

}
