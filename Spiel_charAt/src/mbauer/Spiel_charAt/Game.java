package mbauer.Spiel_charAt;

import java.awt.event.KeyEvent;
import java.lang.reflect.Executable;
import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String welt = "___M__^__";
		int weltLaenge = welt.length();
		char spieler = 'P';
		int posSpieler = 0;
		String input = "";
		char naechstesFeld = ' ';
		boolean berg = false;
		boolean kronleuchter = false;
		boolean inputRichtig = true;

		System.out.println("--- Level Start! ---\n");
		while (posSpieler < weltLaenge) { // Level druchlaufen
			if (inputRichtig) {
				int zahl = 0; 
				while (zahl < weltLaenge) { // Welt zeichnen
					if (posSpieler == zahl) {
						if (kronleuchter == true) {
							System.out.print("ô");
						} else {
							System.out.print(spieler);
						}
					} else {
						System.out.print(welt.charAt(zahl));
					}
					zahl += 1;
				}
			}
			if (posSpieler < weltLaenge - 1) {
				naechstesFeld = welt.charAt(posSpieler + 1);

				if (naechstesFeld == 'M') { // Berg
					berg = true;
				} else {
					berg = false;
				}
				if (naechstesFeld == '^') { // Kronleuchter
					kronleuchter = true;
				} else {
					kronleuchter = false;
				}
				System.out.print("\n\nInput:");
				input = scanner.nextLine();
//				scanner.useDelimiter("");
//				input = scanner.
//				KeyEvent(e);
				inputRichtig = false;
				if (input.equals("r")) { // run
					if (berg) {
						System.out.println("Aua! Berg!");
					} else if (kronleuchter) {
						System.out.println("Aua! Kronleuchter!");
					} else {
						inputRichtig = true;
						posSpieler += 1;
					}
				} else if (input.equals("j")) { // jump
					if (berg) {
						inputRichtig = true;
						posSpieler += 1;
					} else if (kronleuchter) {
						System.out.println("Aua! Kronleuchter!");
					} else {
						System.out.println("Da komme ich mir blöd vor!");
					}
				} else if (input.equals("c")) { // crawl
					if (berg) {
						System.out.println("Aua! Berg!");
					} else if (kronleuchter) {
						inputRichtig = true;
						posSpieler += 1;
					} else {
						System.out.println("Da komme ich mir blöd vor!");
					}
				}
			} else { // ENDE
				posSpieler += 1;
			}
		}
		System.out.println("\n\n --- Level beendet! ---");
	}
}
