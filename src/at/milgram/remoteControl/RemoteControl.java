package at.milgram.remoteControl;

public class RemoteControl {
    private int status;
    public void getStatus(){
        System.out.println(this.status);
    }

    public void turnOn(){
        this.status =  - 5;
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }
}
