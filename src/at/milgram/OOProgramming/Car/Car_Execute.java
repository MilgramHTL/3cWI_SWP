package at.milgram.OOProgramming.Car;

public class Car_Execute {
    public static void main(String[] args) {
        Car c1 = new Car("red", 69, 3, "R8");
        Car c2 = new Car("blue", 64, 2, "A5");

        c1.driveCar();
        c1.turboBoost();
        c1.honk();
        c1.brakeCar();
        c1.getRemainingRange();
        c1.checkFuel();

        System.out.println(" ");

        c2.driveCar();
        c2.turboBoost();
        c2.honk();
        c2.brakeCar();
        c2.getRemainingRange();
        c2.checkFuel();
    }
}
