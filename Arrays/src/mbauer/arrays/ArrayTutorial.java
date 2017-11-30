package mbauer.arrays;

public class ArrayTutorial {
	public static void main(String[] args) {
		int[] myArray = new int[5];
		double[] kommaZahlArray = new double[10];

		myArray[0] = 42;
		myArray[1] = 8;
		myArray[2] = 23;
		myArray[3] = -4;
		myArray[4] = 99;

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

		String myName = "Maximilian";
		char[] namenArray = new char[myName.length()];

		for (int i = 0; i < myName.length(); i++) {
			namenArray[i] = myName.charAt(i);
			System.out.println(namenArray[i]);
		}

		char[] foo = { 'a', 'b', 'c' };
		char[] var = { 'A', 'B', 'C' };

		if (foo.length != var.length) {
			System.out.println("foo und var sind nicht gleich lang!");
		} else {
			for (int i = 0; i < foo.length; i++) {
				System.out.println(foo[i] + " : " + var[i]);
			}
		}
	}
}
