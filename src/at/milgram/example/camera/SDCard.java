package at.milgram.example.camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private double capacity;
    private List<CameraFile> cameraFiles;

    public SDCard(double capacity) {
        this.capacity = capacity;
        this.cameraFiles = new ArrayList<>();
    }

    public void saveFile(CameraFile cameraFiles){
        this.cameraFiles.add(cameraFiles);
    }

    public List<CameraFile> getCameraFiles() {
        return cameraFiles;
    }
}
