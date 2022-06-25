package paquete;

public class Probe extends UnmannedShip{

    public Probe(String name) {
        super(name);
    }

    @Override
    public void launchTheShip() {
        this.speedingUp = true;
        this.isActive = true;
        System.out.println("The Probe - UnnmannedShip: " + this.name + " has been launched");

    }

    @Override
    public void landTheShip() {
        this.speedingUp = false;
        this.isActive = false;
        System.out.println("The Probe - UnnmannedShip: " + this.name + " has landed");
    }

    public void goIntoOrbit(){
        System.out.println("The Probe - UnnmannedShip: " + this.name + " is in Orbit");
    }
}
