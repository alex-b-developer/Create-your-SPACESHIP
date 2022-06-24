package paquete;

public class LunarMissionShip extends MannedShip implements CommunicationTools, ExplorationTools{

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
        System.out.println("Lunar Mission Ship is getting a message form Earth");
    }

    @Override
    public void SendMessageToEarth() {
        System.out.println("Lunar Mission Ship is sending a message to the Earth");
    }
}
