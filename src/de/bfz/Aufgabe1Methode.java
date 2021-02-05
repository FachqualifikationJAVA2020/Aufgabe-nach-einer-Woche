package de.bfz;

public class Aufgabe1Methode {
    public static void main(String[] args) {
        System.out.println(freqRandomNums(20,10));

    }

    public static String freqRandomNums(int rMaxNum, int fMaxNum){
        //  Ein Array von 20 ganzen Zahlen
        int[] numbers = new int[rMaxNum];

        //  Zweites Array zum Speichern der Häufigkeit
        int[] freqNumbers = new int[fMaxNum];

        //  Ausgabe der Zufallszahlen von 1 bis 9
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*10);
        }

        //  Sobald eine Zahl vorhanden ist, diese Zahl + 1
        for(int j = 0 ; j < numbers.length; j++) {
            freqNumbers[numbers[j]]++;
        }

        //  Ausgabe der Zufallszahlen von 1 bis 9
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Zufallszahlen: " + numbers[i]);
        }

        //  Ausgabe der Häufigkeiten
        System.out.println("________________________");
        for(int i = 0 ; i < freqNumbers.length; i++) {
            System.out.println("Zahl: " + i + " | Häufigkeit: " + freqNumbers[i]);
        }

        return "Berechnungen der Zufallszahlen und deren Häufigkeit abgeschlossen";
    }

}
