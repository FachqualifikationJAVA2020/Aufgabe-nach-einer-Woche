package de.bfz;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        //  Benutzereingabe der positiven Zahl
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Geben Sie eine nicht negative Zahl ein: ");

        //  Benutzereingabe in int speichern
        int zahl = eingabe.nextInt();

        //  Scanner schließen
        eingabe.close();

        //  Variable für den Kehrwert
        int kehrwert = 0;

        //  Solange Zahl kleiner als 0
        while (zahl > 0){

            //  kehrwert =
            //  zahl % 10 + das ergebnis von kehrwert * 10
            kehrwert = kehrwert * 10 + (zahl % 10);

            //  Zahl durch 10 dividieren
            zahl = zahl / 10;
        }

        //  Ausgabe der umgedrehten Zahl
        System.out.print(kehrwert + "");
    }
}
