package at.milgram.remoteControl;

public class RemoteControl {

    private Battery battery;

    public RemoteControl(Battery battery) {
        this.battery = battery;
    }

    public void getStatus(){
        System.out.println("Aktueller Kapazitäts Stand: " + this.battery.getCapacity());
    }

    public void turnOn(){
        System.out.println("Verbraucher angeschlossen");
        double currentCapacity = this.battery.getCapacity();
        double fivePercent = 0.05;
        double amountToSubtract = currentCapacity * fivePercent;
        this.battery.setCapacity(currentCapacity - amountToSubtract);
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }
}
