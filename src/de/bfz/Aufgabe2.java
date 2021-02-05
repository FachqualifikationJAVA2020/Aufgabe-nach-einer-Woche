package de.bfz;

import java.util.Arrays;

public class Aufgabe2 {
    public static void main(String[] args) {
        //  Lotto Zahlen
        int[] ziehung = {3, 5, 7, 12, 26, 43};

        //  Lotto Tipp
        int[] lottotipp = {4, 7, 12, 17, 26, 43};


        //  Anzahl der richten Lotto Treffer
        int anzahlTreffer = 0;

        //  Alle Zahlen vom Lottotip durchlaufen
        for(int i = 0; i < lottotipp.length; i++) {
            //  Alle Zahlen von der Lottoziehung durchlaufen
            for(int j = 0; j < ziehung.length; j++) {
                //  Wenn Lottoziehungs Zahl = Lottotipp Zahl
                //  AnzahlTreffer + 1
                if(ziehung[j] == lottotipp[i]) {
                    anzahlTreffer++;
                }
            }
        }

        //  Aktuelle Lottozahlen ausgeben
        System.out.print("Aktuelle Lotto-Zahlen: ");

        // Sortieren
        Arrays.sort(ziehung);

        // Zahl nach Zahl ausgeben
        for(int i = 0; i < ziehung.length; i++){
            System.out.print(ziehung[i] + " ");
        }
        System.out.println();

        //  Eigener Lottotip ausgeben
        System.out.print("Dein Lottotip: ");

        // Java bringt alles mit zum Sortieren =)
        Arrays.sort(lottotipp);

        for(int i = 0; i < lottotipp.length; i++){
            System.out.print(lottotipp[i] + " ");
        }
        System.out.println();

        // Anzahl der Treffer ausgeben
        System.out.println("Sie haben " + anzahlTreffer + " Richtige");

    }
    static void sortiere(int[] array) {
        int n = array.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }




}
