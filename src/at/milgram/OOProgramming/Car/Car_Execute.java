package at.milgram.OOProgramming.Car;

public class Car_Execute {
    public static void main(String[] args) {
        Tank tank1 = new Tank(200, 2, "Titan");
        Tank tank2 = new Tank(300, 3, "Wolfram");
        Tank tank3 = new Tank(400, 4, "Eisen");

        Engine engine1 = new Engine(100, Engine.TYPE.Diesel);
        Engine engine2 = new Engine(100, Engine.TYPE.Diesel);
        Engine engine3 = new Engine(100, Engine.TYPE.Diesel);

        Car c1 = new Car(engine1, tank1, "red", 69,  "R8");
        Car c2 = new Car(engine2, tank2, "blue", 64,  "A5");
        Car c3 = new Car(engine3, tank3, "purple", 99,  "SS9");

        tank1.getRemainingRange();
        engine1.drive(17);
        engine1.driveCar(3000);
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

        c2.turboBoost();
        c2.honk();
        c2.brakeCar();
        c2.checkFuel();

        System.out.println(" ");

        c3.turboBoost();
        c3.honk();
        c3.brakeCar();
        c3.checkFuel();
    }
}
