package at.milgram.example.handy;

public class PhoneFile {
    private String extension;
    private double size;
    private String name;

    public PhoneFile(String extension, double size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public String[] getInfo(){
        return new String[]{name, String.valueOf(size), extension};
    }
    public double getSize() {
        return size;
    }
}