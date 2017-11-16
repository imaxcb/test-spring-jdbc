// 20171116: mbauer
package mbauer.Einfuehrung_Objektorientierung;

public class Grundwissen {
	public static void main(String[] args) {

		Kuh elsa = new Kuh("Elsa", 23, false);

		Kuh emma = new Kuh("Emma", 25, true);

		System.out.println(elsa);
		System.out.println(emma);

		elsa.setName("Elsa die gesunde");
		emma.setName("Emma die kranke");

		System.out.println(elsa);
		System.out.println(emma);

		elsa.muh();
		emma.muh();
		System.out.println("Beide haben gemuht.");

		elsa.frissGras(3);
		emma.frissGras(7);
		System.out.println("Beide fressen Gras");

		System.out.println(elsa);
		System.out.println(emma);

		System.out.println("Der Doktor kommt!");
		elsa.doktorKommt();
		emma.doktorKommt();

		System.out.println(emma);
		System.out.println(elsa);

	}
}
