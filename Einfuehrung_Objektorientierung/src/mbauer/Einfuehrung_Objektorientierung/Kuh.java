// 20171109: mbauer
package mbauer.Einfuehrung_Objektorientierung;

public class Kuh {
	public Kuh(String name, int milchProTag) {
		this.name = name;
		this.milchProTag = milchProTag;
	}

	public String name = "";
	public Euro preis = new Euro(7);
	public boolean istKrank = false;
	public String farbe = "";
	public int milchProTag = -1;
}
