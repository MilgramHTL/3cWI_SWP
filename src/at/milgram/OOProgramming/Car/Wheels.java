package at.milgram.OOProgramming.Car;

public class Wheels {
    private int size;
    private int pressure;
    private String position;

    public Wheels(int size, int pressure, String position){
        this.size = size;
        this.pressure = pressure;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
