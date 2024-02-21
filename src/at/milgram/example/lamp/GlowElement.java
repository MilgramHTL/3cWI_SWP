package at.milgram.example.lamp;

public class GlowElement {

    private String name;
    private String color;
    private double powerConsumption;
    public boolean status;

    public GlowElement(String name, String color, double powerConsumption, boolean status) {
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.status = false;
    }

    public String getName() {
        return name;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void turnOn(){
        if (this.status == true){
            System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet!");
        } else {
            this.status = true;
            this.powerConsumption += 5;
        }
    }
}
