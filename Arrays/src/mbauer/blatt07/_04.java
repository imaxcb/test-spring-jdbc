// 20171130: mbauer: Minumum und Maximum aus 10 Zufallszahlen
package mbauer.blatt07;

import java.util.Random;

public class _04 {
	public static void main(String[] args) {
		Random generator = new Random();
		int[] zufallszahlen = new int[10];

		for (int i = 0; i < zufallszahlen.length; i++) {
			zufallszahlen[i] = generator.nextInt(1000);
		}

		System.out.print("Array: {");
		for (int i = 0; i < zufallszahlen.length; i++) {
			if (i != zufallszahlen.length - 1) {
				System.out.printf("%d, ", zufallszahlen[i]);
			} else {
				System.out.printf("%d", zufallszahlen[i]);
			}
		}

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < zufallszahlen.length; i++) {
			if (zufallszahlen[i] > max) {
				max = zufallszahlen[i];
			}
			if (zufallszahlen[i] < min) {
				min = zufallszahlen[i];
			}
		}
		System.out.printf("}%nMax: %d", max);
		System.out.printf("%nMin: %d", min);

	}
}
