// 20171107: mbauer

package mbauer.Probekurzarbeit;

import java.util.Scanner;

public class _1 {
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		int heizkosten = 0;

		System.out.print("Quadratmeter:");
		double quadratmeter = tastatur.nextDouble();

		System.out.print("Art des Hauses (1-3):");
		int art = tastatur.nextInt();

		switch (art) {
		case 1:
			heizkosten = (int) (quadratmeter * 17.45);
			System.out.printf("Kosten: %d€", heizkosten);
			break;
		case 2:
			heizkosten = (int) (quadratmeter * 12.21);
			System.out.printf("Kosten: %d€", heizkosten);
			break;
		case 3:
			heizkosten = (int) (quadratmeter * 9.32);
			System.out.printf("Kosten: %d€", heizkosten);
			break;
		default:
			System.out.println("Diese Art von Haus gibt es nicht.");
			break;
		}
		tastatur.close();
	}
}
