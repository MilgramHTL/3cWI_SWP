package at.milgram.example.camera;

import java.util.ArrayList;
import java.util.List;

public class Lens {
    private String focalLength;
    private Manufacturer manufacturer;

    public Lens(String focalLength) {
        this.focalLength = focalLength;
        this.manufacturer = null;
    }

    public void saveManufacturer(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
    }
}
