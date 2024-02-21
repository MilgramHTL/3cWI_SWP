package at.milgram.example.lamp;

import java.util.ArrayList;
import java.util.List;
public class lamp {
    private List<GlowElement> glowElements;

    public lamp(){
        this.glowElements = new ArrayList<>();
    }
    public void addGlowElement(GlowElement glowElement){
        this.glowElements.add(glowElement);
    }
    public void turnAllOn() {
        for (GlowElement glowElement : this.glowElements
        ) {
            glowElement.turnOn();
        }
    }

    public double getOverallPowerUsage(){
        int sum = 0;
        for (GlowElement glowElement : this.glowElements
             ) {
            sum += glowElement.getPowerConsumption();
        }
        double overallPowerUsage = sum /this.glowElements.size();
        return overallPowerUsage;
    }

    public void printNamesOfLightElements(){
        for (GlowElement glowElement:this.glowElements
             ) {
            System.out.println(glowElement.getName());
        }
    }
}
