package at.milgram.test.plane;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class TrafficController {
    private ArrayList<Plane> plane;

    public TrafficController() {
        this.plane = new ArrayList<>();
    }
    public void addPlane(Plane plane) {
            this.plane.add(plane);
    }

    public void printPlanes() {
        for (Plane plane : plane) {
            System.out.println(plane.getName());
        }
    }

    public void informPeopleOnAllPlanes(String message) {
        for (Plane plane : plane) {
            plane.informPassengers(message);
        }
    }
}
