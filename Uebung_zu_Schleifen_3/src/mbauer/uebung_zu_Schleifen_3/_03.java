// 20171114: mbauer
package mbauer.uebung_zu_Schleifen_3;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		int zahl = 0;
		int summe = 0;
		int max = 0;
		int min = Integer.MAX_VALUE;

		int i = 1;
		while (zahl != -1) {
			System.out.printf("%d. Zahl: ", i);
			zahl = tastatur.nextInt();
			if (zahl != -1) {
				summe += zahl;
				if (zahl > max) {
					max = zahl;
				}
				if (zahl < min) {
					min = zahl;
				}
				i += 1;
			}
		}
		i -= 1;
		System.out.printf("Summe       : %d%n", summe);
		System.out.printf("Durchschnitt: %.1f%n", (double) summe / (double) i);
		System.out.printf("Maximum     : %d%n", max);
		System.out.printf("Minimum     : %d%n", min);
		System.out.printf("Anzahl      : %d%n", i);
		tastatur.close();
	}
}
