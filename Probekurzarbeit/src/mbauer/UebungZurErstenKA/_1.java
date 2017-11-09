// 20171107: mbauer

package mbauer.UebungZurErstenKA;

import java.util.Scanner;

public class _1 {
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		double rabatt = 0.0;

		System.out.print("Betrag           : ");
		double betrag = tastatur.nextDouble();

		System.out.print("MwSt-Satz        : ");
		int mwstSatz = tastatur.nextInt();

		if (betrag > 100.00) {
			rabatt = betrag * 0.05;
		}
		if (betrag > 1000.00) {
			rabatt = betrag * 0.1;
		}

		double endpreis = betrag - rabatt;
		double mwst = endpreis - (endpreis / ((double) (100 + mwstSatz) / 100.0));

		System.out.println("Endpreis (brutto): " + endpreis);
		System.out.println("Rabatt           : " + rabatt);
		System.out.println("MwSt(" + mwstSatz + "%)        : " + mwst);

		tastatur.close();
	}
}
