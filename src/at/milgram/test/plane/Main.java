package at.milgram.test.plane;

public class Main {
    public static void main(String[] args) {
        Passenger person1 = new Passenger("Lukas", "Wagner");
        Passenger person2 = new Passenger("Raphael", "Maringer");
        Plane plane1 = new Plane("Tui", new Position(10,10));
        Plane plane2 = new Plane("Niki", new Position(20,20));
        TrafficController trafficController = new TrafficController();
        plane1.addPassenger(person1);
        plane2.addPassengers(person2);
        trafficController.addPlane(plane1);
        trafficController.addPlane(plane2);
        trafficController.printPlanes();
        System.out.println();
        trafficController.informPeopleOnAllPlanes("WAZZZZ UP??");
    }
}
