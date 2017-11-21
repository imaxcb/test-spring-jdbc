// 20171116: mbauer: ZickZack laufen
package mbauer.JavaKarol;

import javakarol.*;

public class _03 {
	public static void main(String[] args) {
		int breite = 10, laenge = 10, hoehe = 10;
		int startX = 1, startY = 1;
		char startBlickrichtung = 'S';

		Welt welt = new Welt(breite, laenge, hoehe);
		Roboter karol = new Roboter(startX, startY, startBlickrichtung, welt);

		karol.VerzoegerungSetzen(50);

		while ((karol.PositionXGeben() < breite) && !karol.IstWand()) {
			while (!karol.IstWand()) {
				karol.Schritt();
			}
			karol.LinksDrehen();
			if (!karol.IstWand()) {
				karol.Schritt();
			}
			karol.LinksDrehen();

			while (!karol.IstWand()) {
				karol.Schritt();
			}
			karol.RechtsDrehen();
			if (!karol.IstWand()) {
				karol.Schritt();
			}
			karol.RechtsDrehen();
		}

	}
}
