package com.company;
import java.util.*;

/**
 * Hier wird die erste Subklasse initialisiert
 */
public class Vehicle extends Engine{
    public Vehicle() {
    }

    protected int seats;
    @SuppressWarnings("unused")
    protected int tankvolumen;
    protected String carbrand;

    /**
     * Hier werden semtliche getter/setter erstellt
     * um anschließend entsprechende Werte für die Variablen zu bekommen
     */
    public void setSeats(int value) {
        seats = value;
    }

    public int getSeats() {
        return seats;
    }

    @Deprecated //Tankvolumen wird nicht mehr benötigt
    public int getTankvolumen() {
        // TODO implement here
        return 0;
    }

    @Deprecated //Tankvolumen wird nicht mehr benötigt
    public void setTankvolumen(int value) {
        // TODO implement here
    }


    public String getLicenseplate() {
        // TODO implement here
        return null;
    }


    public void setLicenseplate(String value) {
        // TODO implement here
    }


    public String getCarbrand() {
        // TODO implement here
        return null;
    }


    public void setCarbrand(String value) {
        // TODO implement here
    }

    /**
     * Funktionen werden erstellt und mit der voreingestellten Ausgabe befüllt
      */
    public void drive() {
        System.out.println("Fahre los");
    }

    public void turnright() {
        System.out.println("Fahre nach Rechts");
    }

    public void turnleft() {
        System.out.println("Fahre nach Links");
    }
    public void message(){

    }

}


