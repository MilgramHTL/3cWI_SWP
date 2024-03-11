package at.milgram.example.camera;

public class Manufacturer {
    private String name;
    private String land;

    public Manufacturer(String name, String land) {
        this.name = name;
        this.land = land;
    }

    public String getName() {
        return name;
    }

    public String getLand() {
        return land;
    }
}
