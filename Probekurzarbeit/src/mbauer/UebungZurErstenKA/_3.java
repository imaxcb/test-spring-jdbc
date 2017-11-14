// 20171107: mbauer
package mbauer.UebungZurErstenKA;

import java.util.Scanner;

public class _3 {
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);

		System.out.print("Anzahl: ");
		int anzahl = tastatur.nextInt();

		int i = 1;
		while (i <= anzahl) {
			if (i % 2 == 0) {
				System.out.print("-");
			}

			System.out.print(i);

			if (i < anzahl) {
				System.out.print(", ");
			}
			i += 1;
		}
		tastatur.close();
	}
}
