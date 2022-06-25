package paquete;

public class ExperimentationMissionShip extends MannedShip implements CommunicationTools, ExplorationTools{

    public ExperimentationMissionShip(String name) {
        super(name);
    }
    @Override
    public void landTheShip() {
        this.speedingUp = false;
        this.isActive = false;
        System.out.println("The Experimentation Mission: " + this.name + " has landed");
    }

    @Override
    public void launchTheShip() {
        this.speedingUp = true;
        this.isActive = true;
        System.out.println("The Experimentation Mission: " + this.name + " has been launched");

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

    @Override
    public void getMessageFromEarth() {
        System.out.println("Experimentation Mission Ship getting a message form Earth");
    }

    @Override
    public void SendMessageToEarth() {
        System.out.println("Experimentation Mission Ship Sending a message to the Earth");
    }
}
