// 20171130: mbauer: 10 Zufallszahlen in Array
package mbauer.blatt07;

import java.util.Random;

public class _01 {
	public static void main(String[] args) {
		Random generator = new Random();

		int [] zufallszahlen = new int[10];
		
		for (int i = 0; i < zufallszahlen.length; i++) {
			zufallszahlen[i] = generator.nextInt(1000);
			System.out.println(zufallszahlen[i]);
		}
	}
}
