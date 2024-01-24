package at.milgram.remoteControl;

public class Battery {
    public enum Size {D, C, AA, AAA, A23, PP3}

    private Size batterySize;

    public enum Type {rechargeable, notRechargeable}

    private Type batteryType;
    private double capacity;

    public Battery(Size batterySize, Type batteryType, double capacity) {
        this.batterySize = batterySize;
        this.batteryType = batteryType;
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
