package at.milgram.example.handy;

import java.util.ArrayList;

public class SDCard {
    private ArrayList<PhoneFile> file;
    private double capacity;

    public SDCard(double capacity) {
        this.capacity = capacity;
        this.file = new ArrayList<>();
    }

    public void saveFile(PhoneFile file) {
        if (file != null) {
            this.file.add(file);
            System.out.println("File saved successfully.");
        } else {
            System.out.println("Cannot save null file.");
        }
    }

    public void getFreeSpace() {
        double sum = 0;
        for (PhoneFile file : file) {
            sum += file.getSize();
        }
        System.out.println(capacity - sum);
    }

    public ArrayList<PhoneFile> getAllFiles() {
        return file;
    }
}
