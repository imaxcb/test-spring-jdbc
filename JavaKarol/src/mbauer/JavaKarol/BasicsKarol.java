// 20171116: mbauer
package mbauer.JavaKarol;

import javakarol.Roboter;
import javakarol.Welt;

public class BasicsKarol {
	public static void main(String[] args) {
		Welt welt = new Welt(10, 5, 2);
		Roboter karol = new Roboter(welt);

		karol.VerzoegerungSetzen(50);
		
		System.out.println("x: " + karol.PositionXGeben());
		System.out.println("y: " + karol.PositionYGeben());

		karol.Schritt();
		karol.Hinlegen();
		karol.Warten(2);
		karol.Aufheben();
		
		System.out.println("x: " + karol.PositionXGeben());
		System.out.println("y: " + karol.PositionYGeben());

		while (true) {
			while (!karol.IstWand()) {
				karol.Hinlegen();
				karol.Schritt();
			}
			karol.LinksDrehen();
		}
	}
}
