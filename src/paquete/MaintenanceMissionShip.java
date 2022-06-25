package paquete;

public class MaintenanceMissionShip extends MannedShip implements CommunicationTools, ExplorationTools{

    public MaintenanceMissionShip(String name) {
        super(name);
    }
    @Override
    public void landTheShip() {
        this.speedingUp = false;
        this.isActive = false;
        System.out.println("The Manteniance Mission: " + this.name + " has been launched");
    }

    @Override
    public void launchTheShip() {
        this.speedingUp = true;
        this.isActive = true;
        System.out.println("The Manteniance Mission: " + this.name + " has landed");

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

    public void getMessageFromEarth() {
        System.out.println("Mainteniance Mission Ship is Getting a message form Earth");
    }

    @Override
    public void SendMessageToEarth() {
        System.out.println("Mainteniance Mission Ship Sending a message to the Earth");
    }
}
