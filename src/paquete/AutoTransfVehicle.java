package paquete;

public class AutoTransfVehicle extends UnmannedShip implements ExplorationTools{

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

    @Override
    public void takePhoto() {
        System.out.println("The Photo has been taken. Message from: " + this.name);
    }

    @Override
    public void collectSamples() {
        System.out.println("Samples have been taken from space. Message from: " + this.name);
    }

    @Override
    public void readRadioFrecuencies() {
        System.out.println("the radio frequencies have been read. Message from: " + this.name);
    }
}
