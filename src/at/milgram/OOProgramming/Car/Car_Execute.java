package at.milgram.OOProgramming.Car;

public class Car_Execute {
    public static void main(String[] args) {
        Engine engine = new Engine(100, Engine.TYPE.Diesel);
        Car c1 = new Car(engine,"red", 69, 3, "R8");
        Car c2 = new Car(engine,"blue", 64, 2, "A5");
        Car c3 = new Car(engine,"purple", 99, 33, "SS9");

        engine.drive();
        c1.driveCar();
        c1.turboBoost();
        c1.honk();
        c1.brakeCar();
        c1.getRemainingRange();
        c1.checkFuel();

        System.out.print("Die PS vom Auto 1 beträgt: ");
        System.out.println(c1.getEngine().getHorsePower());

        System.out.println(c1.getColor());
        c1.setColor("green");
        System.out.println(c1.getColor());

        System.out.println(" ");

        c2.driveCar();
        c2.turboBoost();
        c2.honk();
        c2.brakeCar();
        c2.getRemainingRange();
        c2.checkFuel();

        System.out.println(" ");

        c3.driveCar();
        c3.turboBoost();
        c3.honk();
        c3.brakeCar();
        c3.getRemainingRange();
        c3.checkFuel();
    }
}
