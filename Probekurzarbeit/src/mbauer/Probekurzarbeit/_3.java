// 20171107: mbauer

package mbauer.Probekurzarbeit;

import java.util.Scanner;

public class _3 {
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);

		System.out.print("Von: ");
		int von = tastatur.nextInt();

		System.out.print("Bis: ");
		int bis = tastatur.nextInt();

		int summe = 0;
		while (von <= bis) {
			summe += von;
			System.out.print(von);
			if (von < bis) {
				System.out.print("+");
			}
			von += 1;
		}
		System.out.print("=" + summe);
		tastatur.close();
	}
}
