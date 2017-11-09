// 20171109: mbauer
package mbauer.Einfuehrung_Objektorientierung;

public class Euro {

	public Euro(double wertVonAussen) {
		this.wert = wertVonAussen;
	}

	public double wert = 0.0;
	public final String zeichen = "€";

	@Override
	public String toString() {
		return String.format("%.2f %s", wert, zeichen);
	}
}
