package at.milgram.OOProgramming.Car;

public class Car_Execute {
    public static void main(String[] args) {
        Tank tank1 = new Tank(200, 2, "Titan");
        Tank tank2 = new Tank(300, 3, "Wolfram");
        Tank tank3 = new Tank(400, 4, "Eisen");

        Engine engine1 = new Engine(100, Engine.TYPE.Diesel, tank1);
        Engine engine2 = new Engine(100, Engine.TYPE.Diesel, tank2 );
        Engine engine3 = new Engine(100, Engine.TYPE.Diesel, tank3);

        RearMirror r1 = new RearMirror(100, 10);
        RearMirror r2 = new RearMirror(90, -30);

        Car c1 = new Car(engine1,  "red", 69,  "R8");
        Car c2 = new Car(engine2,  "blue", 64,  "A5");
        Car c3 = new Car(engine3,  "purple", 99,  "SS9");

        c1.addMirror(r1);
        c1.addMirror(r2);

        for (RearMirror mirror:c1.getMirrors()) {
            System.out.println(mirror.getPosition());
        }

        c1.drive(17, 60);
        c1.setTurboBoost();
        System.out.println(c1.getEngine().getTank().getFuelAmount());
        c1.drive(17, 60);


        System.out.println(c1.getEngine().getTank().getFuelAmount());
        c1.honk();
        c1.checkFuel();

        System.out.print("Die PS vom Auto 1 beträgt: ");
        System.out.println(c1.getEngine().getHorsePower());

        System.out.println(c1.getColor());
        c1.setColor("green");
        System.out.println(c1.getColor());

        c1.brakeCar();
       /*
        System.out.println(" ");

        c2.setTurboBoost();
        //c2.honk();
        c2.brakeCar();
        c2.checkFuel();

        System.out.println(" ");

        c3.setTurboBoost();
        //c3.honk();
        c3.brakeCar();
        c3.checkFuel();

        */
    }
}
