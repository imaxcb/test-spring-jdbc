// 20171109: mbauer
package mbauer.Einfuehrung_Objektorientierung;

public class Grundwissen {
	public static void main(String[] args) {
		Kuh elsa = new Kuh();
		elsa.name = "elsa";
		elsa.milchProTag = 30;
		elsa.farbe = "lila und weiss";
		elsa.preis.wert = 345.67;

		// Euro elsaPreis = new Euro();
		// elsaPreis.wert = 123.78;
		// elsa.preis = elsaPreis;

		Kuh Gerlinde = new Kuh();
		Gerlinde.name = "Gerlinde";
		Gerlinde.milchProTag = 0;
		Gerlinde.preis.wert = 9001.00;
		Gerlinde.farbe = "braun";

		System.out.println(elsa.preis);
		System.out.println(Gerlinde.preis);
		// System.out.println(elsaPreis);
	}
}
