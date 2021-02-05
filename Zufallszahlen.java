import java.util.Scanner;

public class Zufallszahlen {
	public static void main(String[] args) {
		
		boolean win = false;
		int MIN = 0;
		int MAX = 100;

		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		while (!win) {
			int random = MIN + (int)(Math.random() * MAX);
			System.out.print("Gib eine Zahl zwischen " + MIN + " und " + MAX + " ein und bestätige mit [Enter]: ");
			int input = sc.nextInt();
			
			if (input < MIN | input > MAX) {
				System.out.print("Achste auf die WERTE :) Gib eine Zahl zwischen " + MIN + " und " + MAX + " ein und bestätige mit [Enter]: ");
				input = sc.nextInt();
			}
			
			++count;
			
			if (input > random) {
				System.out.println("Zu groß!\nDie Zufallszahl lautet " + random + "\nDeine Eingabe lautet " + input + "\nVielleicht beim nächsten Mal!");
			} else if(input < random) {
				System.out.println("Zu klein!\nDie Zufallszahl lautet " + random + "\nDeine Eingabe lautet " + input + "\nVielleicht beim nächsten Mal!");
			} else {
				System.out.println("!!!GEWONNEN!!!\nDie Zufallszahl lautet " + random + "\nDeine Eingabe lautet " + input + "\nDu hast " + count + " mal dein Glück versucht!");
				win = true;
			}
		}
		sc.close();		
	}
}
