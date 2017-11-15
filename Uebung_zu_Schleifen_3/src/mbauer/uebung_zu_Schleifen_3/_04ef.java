// 20171114: mbauer
package mbauer.uebung_zu_Schleifen_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _04ef {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new FileInputStream("daten.txt"));
		int schuljahr = file.nextInt();
		String klasse = file.next();
		String fach = file.next();
		String abgehaltenAm = file.next();
		int arbeitszeit = file.nextInt();
		String besprochenAm = file.next();
		int klassenstaerke = file.nextInt();
		int abwesendeSchueler = file.nextInt();

		int i = 1;
		int count1er = 0;
		int count2er = 0;
		int count3er = 0;
		int count4er = 0;
		int count5er = 0;
		int count6er = 0;
		int notensumme = 0;
		while (i <= klassenstaerke - abwesendeSchueler) {
			int note = file.nextInt();
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
		System.out.printf("%nSchuljahr: %d%n%n%n", schuljahr);
		System.out.printf("LEISTUNGSNACHWEIS%n%n");
		System.out.printf("%nFür das Fach: %s%n%n", fach);
		System.out.printf("Klasse:%n%n%s\t\t\tKlassenstärke: %d%n%n", klasse, klassenstaerke);
		System.out.printf("\t\t\tAbwesende:     %d%n%n", abwesendeSchueler);
		System.out.printf("Daten:%n%n");
		System.out.printf("Abgehalten am: %s%n", abgehaltenAm);
		System.out.printf("Arbeitszeit:   %d Minuten%n", arbeitszeit);
		System.out.printf("Besprochen am: %s%n%n%n", besprochenAm);
		System.out.printf("Notenverteilung:%n");
		System.out.printf("1\tx %d\t\t4\tx %d%n", count1er, count4er);
		System.out.printf("2\tx %d\t\t5\tx %d%n", count2er, count5er);
		System.out.printf("3\tx %d\t\t6\tx %d%n%n", count3er, count6er);
		System.out.printf("Durchschnitt: %.2f", durchschnitt);
		file.close();
	}
}
