import paquete.AutoTransfVehicle;
import paquete.ShuttleShip;
import paquete.SpaceShip;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task2: Spaceships");

        SpaceShip Shuttle = new ShuttleShip("Apolo X");

        System.out.println(Shuttle.name);
        Shuttle.launchTheShip();
        Shuttle.landTheShip();

        SpaceShip atv = new AutoTransfVehicle("VehicleName");
    }





}