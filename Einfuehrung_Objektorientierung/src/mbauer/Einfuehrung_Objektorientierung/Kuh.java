// 20171109: mbauer
package mbauer.Einfuehrung_Objektorientierung;

public class Kuh {

	/**
	 * Erzeugt eine neue Kuh ohne Namen, Preis. Die Kuh ist gesund.
	 */
	public Kuh() {

	}

	/**
	 * Erzeugt eine neue Kuh mit Namen und Milch pro Tag und Gesundheitszustand
	 * 
	 * @param name
	 *            Name der Kuh
	 * @param milchProTag
	 *            Wie viel Liter Milch die Kuh pro Tag gibt.
	 * @param istKrank
	 *            Ob die Kuh krank ist. true -> krank; false -> gesund
	 */
	public Kuh(String name, int milchProTag, boolean istKrank) {
		this.name = name;
		this.milchProTag = milchProTag;
		this.istKrank = istKrank;
	}

	private String name = "";

	private boolean istKrank = false;

	private int milchProTag = -1;

	/**
	 * Gibt an, ob die Kuh krank ist.
	 * 
	 * @return true falls Kuh krank; false falls Kuh gesund
	 */
	public boolean istKrank() {
		return this.istKrank;
	}

	/**
	 * Setzt, ob die Kuh krank ist.
	 * 
	 * @param istKrank
	 *            true falls Kuh krank; false falls Kuh gesund
	 */
	public void setKrank(boolean istKrank) {
		this.istKrank = istKrank;
	}

	/**
	 * Gibt die Liter an Milch, die die Kuh pro Tag gibt.
	 * 
	 * @return Liter Milch pro Tag.
	 */
	public int getMilchProTag() {
		return milchProTag;
	}

	/**
	 * Setzt, wie viele Liter Milch die Kuh pro Tag gibt.
	 * 
	 * @param milchProTag
	 *            Liter Milch pro Tag.
	 */
	public void setMilchProTag(int milchProTag) {
		this.milchProTag = milchProTag;
	}

	/**
	 * Gibt den Namen der Kuh.
	 * 
	 * @return Name der Kuh
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Setzt den Namen der Kuh.
	 * 
	 * @param name
	 *            Der neue Name
	 */
	public void setName(String name) {
		if ("".equals(name)) {
			System.err.println("Namenlose Kuh nicht erlaubt");
		} else {
			this.name = name;
		}
	}

	/**
	 * Lässt die Kuh auf der Konsole muhen.
	 */
	public void muh() {
		System.out.println("Muuuuh!");
	}

	/**
	 * Pro kg gefressenem Gras gibt die Kuh einen Liter mehr Milch pro Tag.
	 * 
	 * @param kiloGras
	 *            Die kg an Gras, die die Kuh fressen soll.
	 */
	public void frissGras(int kiloGras) {
		this.milchProTag += kiloGras;
	}

	/**
	 * Wenn der Doktor kommt, wird die Kuh gesund.
	 */
	public void doktorKommt() {
		this.istKrank = false;
	}

	@Override
	public String toString() {
		return String.format("%s (%d) %s", this.name, this.milchProTag, this.istKrank ? "krank" : "gesund");
	}
}
