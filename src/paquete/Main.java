package paquete;

import paquete.AutoTransfVehicle;
import paquete.ShuttleShip;
import paquete.SpaceShip;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task2: Spaceships");


        ShuttleShip Shuttle = new ShuttleShip("Apolo X");
        System.out.println("SPACECRAFT NAME" + Shuttle.name);
        Shuttle.launchTheShip();
        Shuttle.decoupleLoad();
        Shuttle.landTheShip();


        AutoTransfVehicle atv = new AutoTransfVehicle("Vehicle 2025");
        System.out.println("SPACECRAFT NAME: " + atv.name);
        atv.launchTheShip();
        atv.takePhoto();
        atv.collectSamples();
        atv.readRadioFrecuencies();
        atv.landTheShip();

        Probe satellite = new Probe("Pegasus V");
        System.out.println("SPACECRAFT NAME: " + satellite.name);
        satellite.launchTheShip();
        satellite.goIntoOrbit();

        LunarMissionShip mooncraft = new LunarMissionShip(("Delta Future"));
        System.out.println("SPACECRAFT NAME: " + mooncraft.name);
        mooncraft.launchTheShip();
        mooncraft.takePhoto();
        mooncraft.SendMessageToEarth();
        mooncraft.landTheShip();

        MaintenanceMissionShip maintencraft = new MaintenanceMissionShip("H Machinne");
        System.out.println("SPACECRAFT NAME: " + maintencraft.name);
        maintencraft.launchTheShip();
        maintencraft.readRadioFrecuencies();
        maintencraft.takePhoto();
        maintencraft.collectSamples();
        maintencraft.getMessageFromEarth();
        maintencraft.SendMessageToEarth();
        maintencraft.landTheShip();

        ExperimentationMissionShip expercarft = new ExperimentationMissionShip("Athenas 2");
        expercarft.launchTheShip();
        expercarft.SendMessageToEarth();
        expercarft.getMessageFromEarth();
        expercarft.landTheShip();

    }





}