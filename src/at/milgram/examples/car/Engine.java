package at.milgram.examples.car;

public class Engine {
    public enum TYPE {Diesel, Gasoline}
    private TYPE gasType;
    private double maxSpeed;
    private double baseConsumption;
    private double distance;

    public Engine(TYPE gasType, double maxSpeed, double baseConsumption, double distance){
        this.gasType = gasType;
        this.maxSpeed = maxSpeed;
        this.baseConsumption = baseConsumption;
        this.distance = distance;
    }

    public void changeConsumption(){
        if (this.distance > 50000){
            this.baseConsumption = this.baseConsumption * 1.098;
        }
    }
    public TYPE getGasType() {
        return gasType;
    }

    public void setGasType(TYPE gasType) {
        this.gasType = gasType;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(double baseConsumption) {
        this.baseConsumption = baseConsumption;
    }
}
