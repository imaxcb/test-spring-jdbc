// 20171128: mbauer "Zwei Wuerfel"
package mbauer.Casino;

import java.util.Random;

public class _2 {
	public static void main(String[] args) {
		Random generator = new Random();

		int versuche = 10000;
		int[] gewinn = new int[12];

		for (int i = 0; i < versuche; i++) {
			int wuerfel1 = generator.nextInt(6) + 1;
			int wuerfel2 = generator.nextInt(6) + 1;
			boolean pasch = false, meier = false, gerade = false, folge = false, hoheSumme = false;

			// 6-er Pasch
			if (wuerfel1 == 6 && wuerfel2 == 6) {
				gewinn[0]++;
			}
			// Pasch
			if (wuerfel1 == wuerfel2) {
				pasch = true;
				gewinn[1]++;
			}
			// Nicht Pasch
			if (wuerfel1 != wuerfel2) {
				gewinn[2]++;
			}
			// Gerade
			if ((wuerfel1 % 2 == 0) || (wuerfel2 % 2 == 0)) {
				gerade = true;
				gewinn[3]++;
			}
			// Meier
			if ((wuerfel1 == 1 && wuerfel2 == 2) || (wuerfel2 == 1 && wuerfel1 == 2)) {
				meier = true;
				gewinn[4]++;
			}
			// Summe7
			if (wuerfel1 + wuerfel2 == 7) {
				gewinn[5]++;
			}
			// Summe8
			if (wuerfel1 + wuerfel2 == 6) {
				gewinn[6]++;
			}
			// HoheSumme
			if (wuerfel1 + wuerfel2 > 9) {
				hoheSumme = true;
				gewinn[7]++;
			}
			// Folge
			if (Math.abs(wuerfel1 - wuerfel2) == 1) {
				folge = true;
				gewinn[8]++;
			}
			// Super
			if (pasch || meier) {
				gewinn[9]++;
			}
			// Kombination
			if (gerade || folge) {
				gewinn[10]++;
			}
			// Kaufmann
			if (pasch || hoheSumme) {
				gewinn[11]++;
			}
		}

		System.out.printf("Anteil 6er-Pasch:   %.2f%%%n", ((double) gewinn[0] / (double) versuche) * 100);
		System.out.printf("Anteil Pasch:       %.2f%%%n", ((double) gewinn[1] / (double) versuche) * 100);
		System.out.printf("Anteil nicht Pasch: %.2f%%%n", ((double) gewinn[2] / (double) versuche) * 100);
		System.out.printf("Anteil Gerade:      %.2f%%%n", ((double) gewinn[3] / (double) versuche) * 100);
		System.out.printf("Anteil Meier:       %.2f%%%n", ((double) gewinn[4] / (double) versuche) * 100);
		System.out.printf("Anteil Summe7:      %.2f%%%n", ((double) gewinn[5] / (double) versuche) * 100);
		System.out.printf("Anteil Summe8:      %.2f%%%n", ((double) gewinn[6] / (double) versuche) * 100);
		System.out.printf("Anteil Hohesumme:   %.2f%%%n", ((double) gewinn[7] / (double) versuche) * 100);
		System.out.printf("Anteil Folge:       %.2f%%%n", ((double) gewinn[8] / (double) versuche) * 100);
		System.out.printf("Anteil Super:       %.2f%%%n", ((double) gewinn[9] / (double) versuche) * 100);
		System.out.printf("Anteil Kombination: %.2f%%%n", ((double) gewinn[10] / (double) versuche) * 100);
		System.out.printf("Anteil Kaufmann:    %.2f%%%n", ((double) gewinn[11] / (double) versuche) * 100);
	}
}
