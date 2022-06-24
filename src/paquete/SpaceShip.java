package paquete;

public abstract class SpaceShip {
    public String name;
    public boolean speedingUp;
    public boolean inOrbit;

    /*
    Constructor
     */
    public SpaceShip(String name){
        this.name = name;
        this.speedingUp = false;
        this.inOrbit = false;
    }

    /*
    Abstract Methods
     */
    public abstract void launchTheShip();
    public abstract void landTheShip();
}
