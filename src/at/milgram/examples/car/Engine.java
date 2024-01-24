package at.milgram.examples.car;

public class Engine {
    public enum TYPE {Diesel, Gasoline}
    private TYPE gasType;
    private double maxSpeed;
    private double baseConsumption;

    public Engine(TYPE gasType, double maxSpeed, double baseConsumption){
        this.gasType = gasType;
        this.maxSpeed = maxSpeed;
        this.baseConsumption = baseConsumption;
    }
}
