package paquete;

public class LunarMissionShip extends MannedShip{

    public LunarMissionShip(String name) {
        super(name);
    }

    @Override
    public void landTheShip() {
        System.out.println("The Lunar Mission - MannedShip: " + this.name + " has been launched");
    }

    @Override
    public void launchTheShip() {
        System.out.println("The Lunar Mission - MannedShip:" + this.name + " has landed");

    }
}
