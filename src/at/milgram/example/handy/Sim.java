package at.milgram.example.handy;

public class Sim {
    private int id;
    private String number;

    public void SimCard(int id, String number){
        this.id = id;
        this.number = number;
    }

    public void DoCall(String number) {
        System.out.println("Calling number: " + number);
    }

}
