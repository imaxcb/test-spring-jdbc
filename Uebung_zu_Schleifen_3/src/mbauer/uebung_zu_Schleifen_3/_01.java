// 20171114: mbauer
package mbauer.uebung_zu_Schleifen_3;

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		double kilometer = 1.0;

		while (kilometer > 0.0001) {
			System.out.print("Kilometer: ");
			kilometer = tastatur.nextDouble();
			System.out.print("Treibstoff: ");
			double treibstoff = tastatur.nextDouble();
			if (kilometer > 0.0001) {
				double verbrauch = treibstoff / kilometer * 100;
				System.out.printf("Verbrauch: %.1f l/100km%n", verbrauch);
			}
		}
		System.out.println("Auf Wiedersehen.");
		tastatur.close();
	}
}
