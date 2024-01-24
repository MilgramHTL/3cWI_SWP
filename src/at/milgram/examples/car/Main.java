package at.milgram.examples.car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("red", 200.2);
        Engine engine1 = new Engine(Engine.TYPE.Gasoline, 180, 2.05);
        Manufacturer manufacturer1 = new Manufacturer("Johannes", "Spain", 0.04);
        Tank tank1 = new Tank(20, 2);

        manufacturer1.discount();
    }
}
