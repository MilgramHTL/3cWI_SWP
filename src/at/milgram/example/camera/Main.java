package at.milgram.example.camera;

public class Main {
    public static void main(String[] args) {
        Manufacturer m1 = new Manufacturer("Hubert", "Austria");
        Manufacturer m2 = new Manufacturer("Hämmerle", "Finnland");
        Lens lens = new Lens("abc");
        lens.saveManufacturer(m1);
        SDCard card = new SDCard(300);
        Camera camera = new Camera(200, 20, "red", 400);
        camera.addSDCard(card);
        camera.addManufacturer(m2);
        camera.addLens(lens);
        camera.takePicture("bär", "10.12.2023", 20);
        camera.takePicture("fisch", "20.08.2020", 10);
        card.getCameraFiles();
    }
}
