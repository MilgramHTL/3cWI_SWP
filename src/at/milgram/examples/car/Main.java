package at.milgram.examples.car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("red", 200.2);
        Engine engine1 = new Engine(Engine.TYPE.Gasoline, 180, 2.05, 50100);
        Manufacturer manufacturer1 = new Manufacturer(car1,"Johannes", "Spain", 0.96);
        Tank tank1 = new Tank(20, 2);
        System.out.println(car1.getColor());
        System.out.println(car1.getBasePrice());
        manufacturer1.discount();
    }
}
