// 20171109: mbauer
package mbauer.Einfuehrung_Objektorientierung;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Grundwissen {
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);

		Mensch ich = new Mensch();

		System.out.print("Name: ");
		ich.name = tastatur.nextLine();

		System.out.println("Alter: ");
		ich.alter = tastatur.nextInt();

		System.out.printf("Name: %s%nAlter: %d", ich.name, ich.alter);
		
		ich.laufen();
	}
}
