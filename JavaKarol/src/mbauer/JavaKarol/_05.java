// 20171116: mbauer: Ganze Fläche mit Ziegeln belegen
package mbauer.JavaKarol;

import javakarol.Roboter;
import javakarol.Welt;

public class _05 {
	public static void main(String[] args) {
		int breite = 10, laenge = 10, hoehe = 10;
		int startX = 1, startY = 1;
		char startBlickrichtung = 'S';

		Welt welt = new Welt(breite, laenge, hoehe);
		Roboter k = new Roboter(startX, startY, startBlickrichtung, welt);
		k.VerzoegerungSetzen(50);

		// ersten Ziegel legen
		k.Schritt();
		k.LinksDrehen();
		k.LinksDrehen();
		k.Hinlegen();
		k.Schritt();
		k.LinksDrehen();
		k.LinksDrehen();
		// Ende ersten Ziegel legen

		while ((k.PositionXGeben() < breite) && !k.IstWand()) {
			while (!k.IstWand()) {
				k.Hinlegen();
				k.Schritt();
			}
			k.LinksDrehen();
			if (!k.IstWand()) {
				k.Hinlegen();
				k.Schritt();
			}
			k.LinksDrehen();

			while (!k.IstWand()) {
				k.Hinlegen();
				k.Schritt();
			}
			k.RechtsDrehen();
			if (!k.IstWand()) {
				k.Hinlegen();
				k.Schritt();
			}
			k.RechtsDrehen();
		}
	}
}
