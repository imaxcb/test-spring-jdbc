// 20171114: mbauer
package mbauer.uebung_zu_Schleifen_3;

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);

		// a)
		System.out.print("Klassenstärke: ");
		int klassenstaerke = tastatur.nextInt();
		System.out.print("Schüler abwesend: ");
		int abwesendeSchueler = tastatur.nextInt();

		// b)
		System.out.printf("Anzahl fehlender Schüler: %d%n", abwesendeSchueler);
		System.out.printf("Klassenstärke           : %d%n", klassenstaerke);

		// c)
		int i = 1;
		int count1er = 0;
		int count2er = 0;
		int count3er = 0;
		int count4er = 0;
		int count5er = 0;
		int count6er = 0;
		int notensumme = 0;
		while (i <= klassenstaerke - abwesendeSchueler) {
			System.out.printf("Schueler %d: Note: ", i);
			int note = tastatur.nextInt();
			switch (note) {
			case 1:
				count1er += 1;
				break;
			case 2:
				count2er += 1;
				break;
			case 3:
				count3er += 1;
				break;
			case 4:
				count4er += 1;
				break;
			case 5:
				count5er += 1;
				break;
			case 6:
				count6er += 1;
				break;
			}
			notensumme += note;
			i += 1;
		}
		double durchschnitt = (double) notensumme / (double) (klassenstaerke - abwesendeSchueler);
		System.out.printf("Notendurchschnitt: %.2f%n", durchschnitt);

		// d)
		System.out.printf("Anzahl Einser : %d%n", count1er);
		System.out.printf("Anzahl Zewier : %d%n", count2er);
		System.out.printf("Anzahl Dreier : %d%n", count3er);
		System.out.printf("Anzahl Vierer : %d%n", count4er);
		System.out.printf("Anzahl Fünfer : %d%n", count5er);
		System.out.printf("Anzahl Sechser: %d%n", count6er);
		tastatur.close();
	}
}
