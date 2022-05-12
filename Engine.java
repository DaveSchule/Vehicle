package com.company;

import java.util.*;

/**
 * Hier wird die Hauptklasse initialisiert
 */
public class Engine {

    public Engine() {
    }

    protected int numberofcylinder;
    protected int power;


    /**
     * @return
     */
    public int getNumberOfCylinder() {
        // TODO implement here
        return numberofcylinder;
    }

    public void setNumberOfCylinder(int value) {
        numberofcylinder = value;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int value) {
        power = value;
    }

    /**
     * 
     */
    protected void start() {
        System.out.println("Motor wurde gestartet");
    }

    /**
     * 
     */
    protected void brake() {
        // TODO implement here
    }

    /**
     * 
     */
    protected void accerate() {
        // TODO implement here
    }


}

