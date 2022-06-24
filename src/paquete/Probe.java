package paquete;

public class Probe extends UnmannedShip{

    public Probe(String name) {
        super(name);
    }

    @Override
    public void launchTheShip() {
        System.out.println("The Probe - UnnmannedShip: " + this.name + " has been launched");

    }

    @Override
    public void landTheShip() {
        System.out.println("The Probe - UnnmannedShip: " + this.name + " has landed");
    }
}
