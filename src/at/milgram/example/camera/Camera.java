package at.milgram.example.camera;

import java.util.List;

public class Camera {
    private double pixel;
    private double weight;
    private String color;
    private double resolution;
    private SDCard card;
    private Manufacturer manufacturer;
    private Lens lens;

    public Camera(double pixel, double weight, String color, double resolution) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.resolution = resolution;
        this.card = null;
        this.manufacturer = null;
        this.lens = null;
    }

    public void addSDCard(SDCard card) {
        this.card = card;
    }

    public void addManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void addLens(Lens lens) {
        this.lens = lens;
    }

    public void takePicture(String name, String date, double size) {
        CameraFile cF = new CameraFile(name, date, size);
        this.card.saveFile(cF);
    }

    public void printFiles() {
        List<CameraFile> files = card.getCameraFiles();
        for (CameraFile file : files) {
            System.out.println(file.getName() + " : " + file.getSize());
        }
    }
}
