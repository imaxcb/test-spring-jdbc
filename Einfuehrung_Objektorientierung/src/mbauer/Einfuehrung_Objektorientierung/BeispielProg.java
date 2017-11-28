// 20171128: mbauer

package mbauer.Einfuehrung_Objektorientierung;

import java.util.Random;

public class BeispielProg {
	public static void main(String[] args) {
		Random generator = new Random();

		int zufallszahl = generator.nextInt(10);
		int zufallszahl2 = generator.nextInt(2) + 1; // 1 oder 2 

		System.out.println(zufallszahl);
		System.out.println(zufallszahl2);
	}
}
