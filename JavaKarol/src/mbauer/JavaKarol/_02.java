// 20171116: mbauer: Reihe Ziegel rundum
package mbauer.JavaKarol;

import javakarol.*;

public class _02 {
	public static void main(String[] args) {
		int breite = 10, laenge = 10, hoehe = 10;
		int startX = 1, startY = 1;
		char startBlickrichtung = 'S';

		Welt welt = new Welt(breite, laenge, hoehe);
		Roboter karol = new Roboter(startX, startY, startBlickrichtung, welt);

		karol.VerzoegerungSetzen(50);
		
		int wand = 0;
		
		while (wand < 4) {
			while (!karol.IstWand()) {
				karol.Hinlegen();
				karol.Schritt();
			}
			karol.LinksDrehen();
			wand += 1;
		}
	}
}
