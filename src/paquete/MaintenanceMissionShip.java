package paquete;

public class MaintenanceMissionShip extends MannedShip{

    public MaintenanceMissionShip(String name) {
        super(name);
    }
    @Override
    public void landTheShip() {
        System.out.println("The Manteniance Mission - MannedShip: " + this.name + " has been launched");
    }

    @Override
    public void launchTheShip() {
        System.out.println("The Manteniance Mission - MannedShip:" + this.name + " has landed");

    }
}
