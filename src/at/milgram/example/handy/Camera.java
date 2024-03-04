package at.milgram.example.handy;

public class Camera {
    int resolution;


    public Camera(int resolution) {
        this.resolution = resolution;
    }


    public PhoneFile makePicture(String extension, String name) {
        PhoneFile phoneFile = new PhoneFile(extension, resolution * resolution, name);
        return phoneFile;
    }
}
