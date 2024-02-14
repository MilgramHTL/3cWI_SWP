package at.milgram.example.lamp;

public class glowElement {
    public enum STATUS {on,off}
    private STATUS status;
    private String name;
    private String color;
    private double powerConsumption;

    public glowElement(STATUS status, String name, String color, double powerConsumption) {
        this.status = status;
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
