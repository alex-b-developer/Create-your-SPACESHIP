package paquete;

public class AutoTransfVehicle extends UnmannedShip{

    public AutoTransfVehicle(String name) {
        super(name);
    }

    @Override
    public void landTheShip() {
        System.out.println("The AutoTransVehicle - UnnmannedShip: " + this.name + " has been launched");
    }

    @Override
    public void launchTheShip() {
        System.out.println("The AutoTransVehicle - UnnmannedShip: " + this.name + " has landed");

    }
}
