package at.milgram.example.handy;

public class Main {
    public static void main(String[] args) {
        PhoneFile file1 = new PhoneFile("jpg", 2.5,"image");
        PhoneFile file2 = new PhoneFile("docx", 5.5,"inhalt");
        PhoneFile file3 = new PhoneFile("pdf", 10.5,"geografie");
        Sim sim = new Sim(127, "+43066306002006");
        Camera camera = new Camera(1240);
        SDCard card = new SDCard(55);
        card.saveFile(file1);
        card.saveFile(file3);

        Phone phone = new Phone("blue", sim, camera, card);

        phone.printAllFiles();
        phone.makeCall("+4363242344124");
        phone.takePicture(".jpg", "picture5");

    }
}
