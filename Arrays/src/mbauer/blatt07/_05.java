// 20171130: mbauer: Array in ein Anderes kopieren
package mbauer.blatt07;

import java.util.Random;

public class _05 {
	public static void main(String[] args) {
		Random generator = new Random();
		int[] zufallszahlen = new int[10];
		int[] kopie = new int[zufallszahlen.length];

		for (int i = 0; i < zufallszahlen.length; i++) {
			zufallszahlen[i] = generator.nextInt(1000);
		}

		for (int i = 0; i < zufallszahlen.length; i++) {
			kopie[i] = zufallszahlen[i];
		}

		System.out.print("Array: {");
		for (int i = 0; i < zufallszahlen.length; i++) {
			if (i != zufallszahlen.length - 1) {
				System.out.printf("%d, ", zufallszahlen[i]);
			} else {
				System.out.printf("%d", zufallszahlen[i]);
			}
		}
		System.out.print("}");

		System.out.printf("%nKopie: {");
		for (int i = 0; i < kopie.length; i++) {
			if (i != kopie.length - 1) {
				System.out.printf("%d, ", kopie[i]);
			} else {
				System.out.printf("%d", kopie[i]);
			}
		}
		System.out.print("}");

	}
}
