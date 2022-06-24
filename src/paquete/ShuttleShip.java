package paquete;

public class ShuttleShip extends SpaceShip {

    public ShuttleShip(String name){
        super(name);
        this.speedingUp = false;
    }

    @Override
    public void launchTheShip() {
        this.speedingUp = true;
        System.out.println("The ShuttleShip: " + this.name + " has been launched");
    }

    @Override
    public void landTheShip() {
        this.speedingUp = false;
        System.out.println("The ShuttleShip: " + this.name + " has landed");
    }

    public void decoupleLoad(){
        System.out.println("load has been decoupled");
    }
}
