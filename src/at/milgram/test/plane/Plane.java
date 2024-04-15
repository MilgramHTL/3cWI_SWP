package at.milgram.test.plane;

import java.util.ArrayList;


public class Plane {
    private String name;
    private Position position;
    private ArrayList<Passenger> passengers;

    public Plane(String name, Position position) {
        this.name = name;
        this.passengers = new ArrayList<>();
        this.position = position;
    }
    public void addPassengers(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void informPassengers(String message) {
        for (Passenger passenger : this.passengers) {
            passenger.inform(message);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }


}
