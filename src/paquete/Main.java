package paquete;

import paquete.AutoTransfVehicle;
import paquete.ShuttleShip;
import paquete.SpaceShip;
import java.util.Scanner;

/*
@author Alex B.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Task2: Spaceships");
        System.out.println("WELCOME TO THE APPLICATION TO CREATE YOUR FANTASTIC SPACESHIP");
        System.out.println("-----------------\n");

        boolean flag = true;
        do {

            System.out.println("Please type a COOL new name to create your SPACESHIP!!!");
            Scanner read = new Scanner(System.in);
            String name = read.next();

            System.out.println("Please Select the type of The SPACESHIP you want to create:\n" +
                    "1-SHUTTLESHIP. 2-AUTO TRANSF VEHICLE. 3-SATELLITE. 4-lUNAR MISSION SHIP. 5-MAINTENIANCE MISSION SHIP. 6-EXPERIMENTATION MISSION SHIP ");

            Scanner read2 = new Scanner(System.in);
            String option = read2.next();

            switch (option) {
                case "1":
                    ShuttleShip Shuttle = new ShuttleShip(name);
                    System.out.println("SPACECRAFT NAME: " + Shuttle.name);
                    Shuttle.launchTheShip();
                    Shuttle.decoupleLoad();
                    Shuttle.landTheShip();
                    break;

                case "2":
                    AutoTransfVehicle atv = new AutoTransfVehicle(name);
                    System.out.println("SPACECRAFT NAME: " + atv.name);
                    atv.launchTheShip();
                    atv.takePhoto();
                    atv.collectSamples();
                    atv.readRadioFrecuencies();
                    atv.landTheShip();
                    break;

                case "3":
                    Probe satellite = new Probe(name);
                    System.out.println("SPACECRAFT NAME: " + satellite.name);
                    satellite.launchTheShip();
                    satellite.goIntoOrbit();
                    break;

                case "4":
                    LunarMissionShip mooncraft = new LunarMissionShip((name));
                    System.out.println("SPACECRAFT NAME: " + mooncraft.name);
                    mooncraft.launchTheShip();
                    mooncraft.takePhoto();
                    mooncraft.SendMessageToEarth();
                    mooncraft.landTheShip();
                    break;

                case "5":
                    MaintenanceMissionShip maintencraft = new MaintenanceMissionShip(name);
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
                    ExperimentationMissionShip expercarft = new ExperimentationMissionShip(name);
                    expercarft.launchTheShip();
                    expercarft.SendMessageToEarth();
                    expercarft.getMessageFromEarth();
                    expercarft.landTheShip();
                    break;
                default:
                    System.out.println("You have selected an invalid value ABORTED MISSION");
            }

            System.out.println("\nPlease type any key to create a new SPACESHIP or type 'exit' if you want to leave the program");

            Scanner read3 = new Scanner(System.in);
            String response = read3.next();

            if (response.equals("exit")||response.equals("EXIT")||response.equals("Exit")) {
                flag = false;
            }
        } while (flag == true);

    }


}