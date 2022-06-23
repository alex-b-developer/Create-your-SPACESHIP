package paquete;

public abstract class SpaceShip {
    public String name;
    public float weight;
    public float size;
    public float pushing;

    public boolean speedingUp;
    public boolean inOrbit;

    public abstract void launchTheShip();
    public abstract void landTheShip();
}
