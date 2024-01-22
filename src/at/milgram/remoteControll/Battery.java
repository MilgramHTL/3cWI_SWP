package at.milgram.remoteControll;

public class Battery {
    public enum Size {D, C, AA, AAA, A23, PP3}
    private Size batterySize;
    public enum Type {rechargeable, notRechargeable}
    private Type batteryType;
    private int capacity;

    public Battery(Size batterySize, Type batteryType, int capacity) {
        this.batterySize = batterySize;
        this.batteryType = batteryType;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
