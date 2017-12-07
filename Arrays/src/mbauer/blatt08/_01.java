// 20171207 mbauer: Suchen in char-Array
package mbauer.blatt08;

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);

		System.out.println("Eingabe Text: ");
		String eingabe = tastatur.nextLine();

		char[] eingabeArray = new char[eingabe.length()];
		for (int i = 0; i < eingabeArray.length; i++) {
			eingabeArray[i] = eingabe.charAt(i);
		}

		while (true) {

			System.out.println("Eingabe Wort: ");
			String wort = tastatur.nextLine();

			int startIndex = eingabe.toLowerCase().indexOf(wort.toLowerCase());
			int endIndex = startIndex + wort.length();
			System.out.printf("%n%s wurde gefunden von Index %d bis Index %d%n%n", wort, startIndex, endIndex);
		}

	}
}
