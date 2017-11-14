// 20171107: mbauer

package mbauer.Probekurzarbeit;

import java.util.Scanner;

public class _2 {
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);

		System.out.print("Darlehen: ");
		double darlehen = tastatur.nextDouble();

		System.out.print("Rückzahlung: ");
		double rueckzahlung = tastatur.nextDouble();

		int i = 1;
		darlehen -= rueckzahlung;
		while (darlehen >= rueckzahlung) {
			System.out.printf("%d.Monat: %.0f%n", i, darlehen);
			darlehen -= rueckzahlung;
			i += 1;
		}
		System.out.printf("Restzahlung: %.0f%n", darlehen);
		tastatur.close();
	}
}
