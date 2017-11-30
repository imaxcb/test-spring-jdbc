// 20171130: mbauer: Produkt der 10 Zufallszahlen in Array
package mbauer.blatt07;

import java.util.Random;

public class _03 {
	public static void main(String[] args) {
		Random generator = new Random();

		int[] zufallszahlen = new int[10];
		int produkt = 1;


		for (int i = 0; i < zufallszahlen.length; i++) {
			zufallszahlen[i] = generator.nextInt(1000);
		}
		
		System.out.print("Array = {");
		for (int i = 0; i < zufallszahlen.length; i++) {
			produkt *= zufallszahlen[i];
			if (i == zufallszahlen.length - 1) {
				System.out.printf("%d ", zufallszahlen[i]);
			} else {
				System.out.printf("%d, ", zufallszahlen[i]);
			}
		}
		System.out.printf("}%nAusgabe: ");

		for (int i = 0; i < zufallszahlen.length; i++) {
			System.out.print(zufallszahlen[i]);
			if (i != zufallszahlen.length) {
				System.out.print(" * ");
			}
		}
		System.out.printf(" = %d", produkt);
	}
}
