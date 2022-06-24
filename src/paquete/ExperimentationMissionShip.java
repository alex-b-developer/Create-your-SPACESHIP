package paquete;

public class ExperimentationMissionShip extends MannedShip{

    public ExperimentationMissionShip(String name) {
        super(name);
    }
    @Override
    public void landTheShip() {
        System.out.println("The Experimentation Mission - MannedShip: " + this.name + " has been launched");
    }

    @Override
    public void launchTheShip() {
        System.out.println("The Experimentation Mission - MannedShip:" + this.name + " has landed");

    }
}
