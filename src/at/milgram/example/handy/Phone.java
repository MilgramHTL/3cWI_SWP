package at.milgram.example.handy;

public class Phone {
    private String color;
    Sim simCard;
    Camera camera;
    SDCard sdCard;

    public Phone(String color, Sim simCard, Camera camera, SDCard sdCard) {
        this.color = color;
        this.simCard = simCard;
        this.camera = camera;
        this.sdCard = sdCard;
    }

    public void takePicture(String extension, String name){
        PhoneFile file = camera.makePicture(extension, name);
        if(file.getSize() > sdCard.getFreeSpace()){
            sdCard.saveFile(file);
        }
        else {
            System.out.println("Kein Speicher mehr vorhanden!");
        }
    }

    public void makeCall(String number){
        simCard.DoCall(number);
    }


    public double getFreeSpace(){
        return sdCard.getFreeSpace();
    }

    public void printAllFiles(){
        for (PhoneFile file: sdCard.getAllFiles()) {
            for (String info: file.getInfo()) {
                System.out.println(info + " ");
            }
        }
    }
}
