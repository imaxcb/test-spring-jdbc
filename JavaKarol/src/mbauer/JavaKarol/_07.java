// 20171123: mbauer: Ganze Fläche mit Pyramide
package mbauer.JavaKarol;

import java.time.Year;

import javakarol.Roboter;
import javakarol.Welt;

public class _07 {
	public static void main(String[] args) {
		int breite = 10, laenge = 10, hoehe = 10;
		int startX = 1, startY = 1;
		char startBlickrichtung = 'S';
		int istHoehe = 0;
		int sollHoehe = 1;
		if (breite < laenge) {
			sollHoehe = (breite - 1) / 2;
		} else {
			sollHoehe = (laenge - 1) / 2;
		}

		Welt welt = new Welt(breite, laenge, hoehe);
		Roboter k = new Roboter(startX, startY, startBlickrichtung, welt);
		k.VerzoegerungSetzen(15);

		// ersten Ziegel legen
		k.Schritt();
		k.LinksDrehen();
		k.LinksDrehen();
		k.Hinlegen();
		k.Schritt();
		k.LinksDrehen();
		k.LinksDrehen();
		// Ende ersten Ziegel legen

		int tempLaenge = laenge;
		int tempBreite = breite;
		int cnt = 0;
		while (istHoehe < sollHoehe) {
			while (k.PositionXGeben() < tempBreite) {
				for (int i = 1; i < tempLaenge; i++) {
					if (k.PositionXGeben() < tempBreite) {
						k.Hinlegen();
						k.Schritt();
						cnt += 1;
					}
				}
				k.LinksDrehen();
				k.Hinlegen();
				k.Schritt();
				k.LinksDrehen();

				for (int i = 1; i < tempBreite; i++) {
					k.Hinlegen();
					k.Schritt();
					cnt += 1;
				}
				
				if (k.PositionXGeben() < tempBreite) {
					k.RechtsDrehen();
					k.Hinlegen();
					k.Schritt();
					k.RechtsDrehen();
				} else {
					k.LinksDrehen();
					cnt = 1;
					while (cnt < tempBreite - 1) {
						k.Schritt();
						cnt += 1;
					}
					k.LinksDrehen();
				}

			}
			tempBreite -= 2;
			tempLaenge -= 2;
			istHoehe += 1;
		}
	}
}
