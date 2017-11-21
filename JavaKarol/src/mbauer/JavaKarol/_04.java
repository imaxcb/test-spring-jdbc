// 20171116: mbauer: Ein Ziegel pro Ecke
package mbauer.JavaKarol;

import javakarol.Roboter;
import javakarol.Welt;

public class _04 {
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
				karol.Schritt();
			}
			karol.LinksDrehen();
			karol.Schritt();
			karol.LinksDrehen();
			karol.LinksDrehen();
			karol.Hinlegen();
			karol.LinksDrehen();
			karol.LinksDrehen();
			wand += 1;
		}
	}

}
