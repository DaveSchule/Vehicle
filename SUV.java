package com.company;

/**
 * Subklasse erbt von Vehicle
 */
public class SUV extends Vehicle{

    public SUV() {

    }

    protected double groundclearance;

    /**
     * getter/setter der Klasse SUV werden initialisiert
     *
     */
    public double getGroundclearance() {
        return groundclearance;
    }

    public void setGroundclearance(double value) {
        groundclearance = value;
    }

@Override
public void message(){
    System.out.println("Test");
}
}


