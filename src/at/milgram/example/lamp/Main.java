package at.milgram.example.lamp;

public class Main {
    public static void main(String[] args) {
        GlowElement g1 = new GlowElement("SX170", "red", 2, false);
        GlowElement g2 = new GlowElement("GTR-R34", "blue", 8, true);
        lamp l1 = new lamp();

        l1.addGlowElement(g1);
        l1.addGlowElement(g2);

        g2.turnOn();
        l1.turnAllOn();
        System.out.println(l1.getOverallPowerUsage());
        l1.printNamesOfLightElements();

    }
}
