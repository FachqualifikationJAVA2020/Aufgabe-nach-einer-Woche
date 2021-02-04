package de.bfz;

import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
        //  Benutzereingabe
        Scanner userInput = new Scanner(System.in);

        //  Zufallszahl
        int randomNum = (int)(Math.random()*100+1);

        //  Versuchszähler
        int count = 0;

        //  Solange bis break;
        while (true) {
            System.out.println("Welche Zahl habe ich in meinen Bytes ? (0-100)");
            int userNum = userInput.nextInt();

            //  Versuche hochzählen
            count++;

            //  Nur Zahlen zwischen 1 und 100 erlaubt
            if (userNum < 1 || userNum >100) {
                System.err.println("Nur Zahlen zwischen 1 und 100!");
                continue;
            }

            //  Wenn richtig getipp, while-Schleife beenden
            if (randomNum == userNum) {
                System.out.println("Du hast dir den Titel >> SuperTipper << verdient.! Nur " + count + " Versuche benötigt!");
                break;
            }

            // Wenn zahl klein oder größer ist while-Schleife wiederholen
            else if (randomNum > userNum)
                System.out.println("Nee, meine Zahl ist größer als deine!");
            else if (randomNum < userNum)
                System.out.println("Nee, meine Zahl ist kleiner als deine!");

        }

        // Benutzer eingabe schließen
        userInput.close();
    }
}
