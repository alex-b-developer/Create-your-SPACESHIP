package paquete;

import paquete.AutoTransfVehicle;
import paquete.ShuttleShip;
import paquete.SpaceShip;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task2: Spaceships");
        System.out.println("-----------------\n");

        System.out.println("Please Select the type of The SPACESHIP you want to create:\n" +
                "1-SHUTTLESHIP. 2-AUTO TRANSF VEHICLE. 3-SATELLITE. 4-lUNAR MISSION SHIP. 5-MAINTENIANCE MISSION SHIP. 6-EXPERIMENTATION MISSION SHIP ");



        Scanner read = new Scanner (System.in);

        String option = read.next();
        switch (option) {
            case "1":
                    ShuttleShip Shuttle = new ShuttleShip("Apolo X");
                    System.out.println("SPACECRAFT NAME: " + Shuttle.name);
                    Shuttle.launchTheShip();
                    Shuttle.decoupleLoad();
                    Shuttle.landTheShip();
                    break;

            case "2":
                    AutoTransfVehicle atv = new AutoTransfVehicle("Vehicle 2025");
                    System.out.println("SPACECRAFT NAME: " + atv.name);
                    atv.launchTheShip();
                    atv.takePhoto();
                    atv.collectSamples();
                    atv.readRadioFrecuencies();
                    atv.landTheShip();
                    break;

            case "3":
                    Probe satellite = new Probe("Pegasus V");
                    System.out.println("SPACECRAFT NAME: " + satellite.name);
                    satellite.launchTheShip();
                    satellite.goIntoOrbit();
                    break;

            case "4":
                    LunarMissionShip mooncraft = new LunarMissionShip(("Delta Future"));
                    System.out.println("SPACECRAFT NAME: " + mooncraft.name);
                    mooncraft.launchTheShip();
                    mooncraft.takePhoto();
                    mooncraft.SendMessageToEarth();
                    mooncraft.landTheShip();
                    break;

            case "5":
                    MaintenanceMissionShip maintencraft = new MaintenanceMissionShip("H Machinne");
                    System.out.println("SPACECRAFT NAME: " + maintencraft.name);
                    maintencraft.launchTheShip();
                    maintencraft.readRadioFrecuencies();
                    maintencraft.takePhoto();
                    maintencraft.collectSamples();
                    maintencraft.getMessageFromEarth();
                    maintencraft.SendMessageToEarth();
                    maintencraft.landTheShip();
                    break;

            case "6":
                    ExperimentationMissionShip expercarft = new ExperimentationMissionShip("Athenas 2");
                    expercarft.launchTheShip();
                    expercarft.SendMessageToEarth();
                    expercarft.getMessageFromEarth();
                    expercarft.landTheShip();
                    break;
            default:
                System.out.println("You have selected an invalid value");
        }


    }





}