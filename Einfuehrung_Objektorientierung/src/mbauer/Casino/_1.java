// 20171128: mbauer "Kinderwuerfel"
package mbauer.Casino;

import java.util.Random;

public class _1 {
	public static void main(String[] args) {
		Random generator = new Random();

		int versuche = 10000;
		int gewinn = 0;

		for (int i = 0; i < versuche; i++) {
			if (generator.nextInt(6) == 5) {
				gewinn++;
			}
		}

		double prozentSatz = ((double) gewinn / (double) versuche) * 100;

		System.out.printf("Anteil Gewinner: %.2f%%", prozentSatz);

	}
}
