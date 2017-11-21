// 20171116: mbauer: Erste Reihe voller Ziegel
package mbauer.JavaKarol;

import javakarol.*;

public class _01 {
	public static void main(String[] args) {
		Welt welt = new Welt(10, 10, 10);
		Roboter karol = new Roboter(1, 1, 'S', welt);

		karol.VerzoegerungSetzen(50);

		// Erster Stein:
		karol.Schritt();
		karol.RechtsDrehen();
		karol.RechtsDrehen();
		karol.Hinlegen();
		karol.Schritt();
		karol.RechtsDrehen();
		karol.RechtsDrehen();
		// Ende erster Stein

		while (!karol.IstWand()) {
			karol.Hinlegen();
			karol.Schritt();
		}
		karol.RechtsDrehen();
		karol.RechtsDrehen();

		while (!karol.IstWand()) {
			karol.Schritt();
		}
	}
}
