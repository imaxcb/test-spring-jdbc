// 20171109: mbauer
package mbauer.Einfuehrung_Objektorientierung;

public class Euro {
	public double wert = 0.0;
	public final String zeichen = "€";

	public String toString() {
		return String.format("%.2f %s", wert, zeichen);
	}
}
