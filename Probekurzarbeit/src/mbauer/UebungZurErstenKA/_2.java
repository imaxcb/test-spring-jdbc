// 20171107: mbauer

package mbauer.UebungZurErstenKA;

import java.util.Scanner;

public class _2 {
	public static void main(String[] args) {
		Scanner tastatur = new Scanner((System.in));
		int summe = 0;
		int max = 0;
		double avg = 0.0;

		System.out.print("Anzahl: ");
		int anzahl = tastatur.nextInt();

		int i = 1;
		while (i <= anzahl) {
			System.out.printf("%d. Zahl: ", i);
			int zahl = tastatur.nextInt();
			if (zahl < 0) {
				System.out.println("Die Zahl ist zu klein. Zahl erneut eingeben!%n");
			} else {
				summe += zahl;
				avg = ((double) summe) / ((double) i);
				if (zahl > max) {
					max = zahl;
				}
				i += 1;
			}
		}
		System.out.printf("Summe       : %d%n", summe);
		System.out.printf("Durchschnitt: %.1f%n", avg);
		System.out.printf("Größte Zahl : %d%n", max);
		tastatur.close();
	}
}
