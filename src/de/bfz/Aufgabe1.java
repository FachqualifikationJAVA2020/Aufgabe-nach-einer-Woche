package de.bfz;

public class Aufgabe1 {

    public static void main(String[] args) {
        //  Ein Array von 20 ganzen Zahlen
        int[] numbers = new int[20];

        //  Ausgabe der Zufallszahlen von 1 bis 9
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*10);
            System.out.println("Zufallszahlen: " + numbers[i]);
        }

        //  Zweites Array zum Speichern der Häufigkeit
        int[] freqNumbers = new int[10];

        //  Sobald eine Zahl vorhanden ist, diese Zahl + 1
        for(int j = 0 ; j < numbers.length; j++) {
            freqNumbers[numbers[j]]++;
        }

        //  Ausgabe der Häufigkeiten
        System.out.println("________________________");
        for(int i = 0 ; i < freqNumbers.length; i++) {
            System.out.println("Zahl: " + i + " | Häufigkeit: " + freqNumbers[i]);
        }
    }
}
