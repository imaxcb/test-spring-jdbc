// 20170928: mbauer
package mbauer.test0;

import java.util.Scanner;

public class test0 {
	public static void main(String[] args) {
		// while (1 < 2) {
		Scanner scanner = new Scanner(System.in);
		// System.out.print("Geben Sie eine Zahl ein: ");
		// int zahl = scanner.nextInt();
		// scanner.nextLine();
		//
		// if (zahl % 2 == 0) {
		// System.out.println(zahl + " ist gerade\n");
		// } else {
		// System.out.println(zahl + " ist ungerade\n");
		// }

		System.out.println("Geben Sie eine Fließkommazahl ein: ");
		double kommazahl1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Geben Sie die zu vergleichende Fließkommazahl ein: ");
		double kommazahl2 = scanner.nextDouble();
		scanner.nextLine();

		if (kommazahl1 == kommazahl2)
			System.out.printf("%.2f und %.2f sind gleich \n", kommazahl1, kommazahl2);
		else
			System.out.printf("%.2f und %.2f sind ungleich \n", kommazahl1, kommazahl2);
		scanner.close();
		// System.out.print("Geben Sie einen Text ein: ");
		// String string1 = scanner.nextLine();
		// System.out.print("\nGeben Sie einen Vergleichstext ein: ");
		// String string2 = scanner.nextLine();
		//
		// if (string1.equals(string2))
		// System.out.println(string1 + " und " + string2 + " sind gleich\n");
		// else
		// System.out.println(string1 + " und " + string2 + " sind ungleich\n");
		// }
	}
}
