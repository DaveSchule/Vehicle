package com.company;
import java.io.OutputStream;

/**
 * @author David.PROMBERGER
 * @version
 */
public class Main {

    public static void main(String[] args) {

/**
 * Hier wird ein neues Objekt erstellt,
 * mit den benötigten Paramtern für die getter/setter befüllt und
 * einzelne Funktionen ausgeführt
 */
		SUV Auto = new SUV();
		Auto.setSeats(5);
		Auto.turnleft();
		Auto.drive();
		Auto.setGroundclearance(25.5);
		Auto.setNumberOfCylinder(8);
		Auto.setPower(450);
		Auto.message();

/**
 * Ausgabe der eingetragenen Paramtern von getter/setter
 */
		System.out.println("Anzahl Sitze: "+Auto.seats);
		System.out.println("Höhe des Fahrzeugs: "+Auto.groundclearance);
		System.out.println("Ihr Fahrzeug hat "+Auto.numberofcylinder +" Zylinder, mit einer Leistung von " +Auto.power + " PS.");

    }

}



