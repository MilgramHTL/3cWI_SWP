package at.milgram.example.camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private double capacity;
    private List<CameraFiles> cameraFiles;

    public SDCard(double capacity) {
        this.capacity = capacity;
        this.cameraFiles = new ArrayList<>();
    }

    public void saveFile(CameraFiles cameraFiles){
        this.cameraFiles.add(cameraFiles);
    }

    public List<CameraFiles> getCameraFiles() {
        return cameraFiles;
    }
}
