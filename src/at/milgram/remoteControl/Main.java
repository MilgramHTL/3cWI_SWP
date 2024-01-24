package at.milgram.remoteControl;

public class Main {
    public static void main(String[] args) {
        Battery battery1 = new Battery(Battery.Size.AAA, Battery.Type.rechargeable, 20);
        Battery battery2 = new Battery(Battery.Size.AAA, Battery.Type.rechargeable, 30);

        RemoteControl rc = new RemoteControl(battery1);
        rc.getStatus();
        rc.turnOn();
        rc.turnOff();
        rc.getStatus();
    }
}
