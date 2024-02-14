package at.milgram.examples.car;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(Engine.TYPE.Gasoline, 180, 2.05, 50100);
        Engine engine2 = new Engine(Engine.TYPE.Diesel, 370, 3.5, 300);
        Tank tank1 = new Tank(20, 2);
        Car car1 = new Car(engine1, tank1,"red", 200.2);
        Manufacturer manufacturer1 = new Manufacturer(car1,"Johannes", "Spain", 0.96);
        System.out.println(car1.getColor());
        System.out.println(car1.getBasePrice());
        engine1.changeConsumption();
        engine2.changeConsumption();
        System.out.println(engine1.getBaseConsumption());
        System.out.println(engine2.getBaseConsumption());
        manufacturer1.discount();
    }
}
