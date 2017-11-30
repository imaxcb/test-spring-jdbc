// 20171116: mbauer: Treppe mit 5 Stufen
package mbauer.JavaKarol;

import javakarol.Roboter;
import javakarol.Welt;

public class _06 {
	public static void main(String[] args) {
		int breite = 10, laenge = 10, hoehe = 10;
		int startX = 1, startY = 1;
		char startBlickrichtung = 'S';

		Welt welt = new Welt(breite, laenge, hoehe);
		Roboter k = new Roboter(startX, startY, startBlickrichtung, welt);
		Roboter l = new Roboter(startX+1, startY+1, startBlickrichtung, welt);
		k.VerzoegerungSetzen(25);

		int treppenIstHoehe = 0;
		int treppenSollHoehe = 5;
		int distanz = treppenSollHoehe;
		while (treppenIstHoehe < treppenSollHoehe) {

			// Ziegel legen
			while (k.PositionYGeben() <= distanz) {
				k.Hinlegen();
				k.Schritt();
			}
			treppenIstHoehe += 1;
			k.LinksDrehen();
			k.LinksDrehen();
			int stepcnt = 0;

			// Zurücklaufen
			while (stepcnt < distanz - treppenIstHoehe) {
				k.Schritt();
				stepcnt += 1;
			}
			k.LinksDrehen();
			k.LinksDrehen();
		}
	}
}
