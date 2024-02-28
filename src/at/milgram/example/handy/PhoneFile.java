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

    public void getInfo(){
        System.out.println(getExtension());
        System.out.println(getSize());
        System.out.println(getName());
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
