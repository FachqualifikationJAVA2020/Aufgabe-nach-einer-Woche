import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		
		int lotteryArray[] = new int[6];
		int lot_TipArray[] = new int[6];
		int score = 0;
		int MIN = 1;
		int MAX = 49;
		int random;
	
	    for (int index = 0; index < 6; index++) {
	        random = MIN + (int)(Math.random() * MAX);
	        for (int ii = 0; ii < index; ii++) {
	            if (lotteryArray[ii] == random) { // prüfen auf dubletten
	                random = MIN + (int)(Math.random() * MAX);// dublette gefunden = neuer int ist fertig
	                ii = -1; // muss nochmal durchlaufen, wenn dublette ersetzt wurde, daher wird x zurückgesetzt
	            }
	        }
	        lotteryArray[index] = random;
	    }
	    
	    System.out.println("_______________LOTTOTRON_3000_______________ \n\n     Gib deinen Tip ab! 6 Zahlen [1-49] \n              Trennzeichen [ ]");
	    System.out.println("____________________________________________\n");
	    
	    Scanner sc = new Scanner(System.in);
    	for (int index = 0; index < lot_TipArray.length; index++) {
    		lot_TipArray[index] = sc.nextInt();
    	}
	    sc.close();
	    
	    for(int index = 0; index < lot_TipArray.length; index++) {
            for(int i = 0; i < lotteryArray.length; i++) {
                if(lotteryArray[i] == lot_TipArray[index]) {
                    score++;
                }
            }
        }
	    if (score == 0) {
	    	System.out.println("Das war wohl nix!");
	    	System.out.println("____________________________________________\n");
	    	System.out.print("       Dein Tip lautet: ");
	    	for (int index = 0; index < lot_TipArray.length; index++) {
	    		System.out.print(lot_TipArray[index] + " ");
	    	}
    		System.out.print("\nDie Lottozahlen lauten: ");
	    	for (int index = 0; index < lotteryArray.length; index++) {
	    		System.out.print(lotteryArray[index] + " ");
	    	}
	    	System.out.println("\n____________________________________________");
	    } else {
		    System.out.println("Herzlichen Glückwunsch! \nDu hast " + score + " Treffer :D");
		    System.out.println("____________________________________________\n");
	    	System.out.print("       Dein Tip lautet: ");
	    	for (int index = 0; index < lot_TipArray.length; index++) {
	    		System.out.print(lot_TipArray[index] + " ");
	    	}
    		System.out.print("\nDie Lottozahlen lauten: ");
	    	for (int index = 0; index < lotteryArray.length; index++) {
	    		System.out.print(lotteryArray[index] + " ");
	    	}
	    	System.out.println("\n____________________________________________");
	    }
	}
}
	
