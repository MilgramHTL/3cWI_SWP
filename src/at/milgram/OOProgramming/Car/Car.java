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

    public void driveCar(String color, double fuel, double fuelConsumption, String serialNumber) {
        System.out.println("Das Auto mit der Farbe " + color + ", Seriennummer " + serialNumber + " fährt.");

        this.distance = 90.0;
        this.fuelUsed = this.distance / fuelConsumption;
        this.fuel -= fuelUsed;

        System.out.println("Treibstoffverbrauch: " + this.fuelUsed + " Liter");
        System.out.println("Verbleibender Kraftstoff: " + this.fuel + " Liter");
    }
    public void turboBoost(){
        if (this.distance/10 < this.fuel) {
            this.fuel -= 4;
            System.out.println(this.fuel);
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }
    public void honk(){
        System.out.println("Anzahl der Huper: ");
        this.scanner = new Scanner(System.in);
        this.amountOfRepetitions = Integer.parseInt(this.scanner.next());
        for(int i = 0; i <= this.amountOfRepetitions; i++) {
            System.out.println("Tuuuuuuut");
        }
    }
    public void getRemainingRange(){
        this.remainingDistance = this.distance - this.fuelUsed;
        System.out.println("Das Fahrzeug könnte noch: " + this.remainingDistance + " fahren.");
    }
    public void brakeCar() {
        System.out.println("Das Auto bremst.");
    }

}
