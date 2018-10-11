package uebung3;

import java.util.Scanner;

public class Winkelabmessung {

public static void main (String[] args) {
	Scanner input=new Scanner(System.in);
	double winkel;
	char einheit;
	do {
		System.out.print("Winkeleingabe");
		winkel=input.nextDouble();
		
		System.out.print("Einheiteingabe");
		String symbole=input.next();
		einheit=symbole.charAt(0);
		
		if (einheit=='r') {
		} else if (einheit=='g'){
				
	}
} while (einheit=='g'||einheit=='r');

}
}