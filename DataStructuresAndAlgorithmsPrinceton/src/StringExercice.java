import java.util.Arrays;

public class StringExercice {

	/*
	 * Ceci est un simple test Bonjour tous le monde Hello world
	 * 
	 * résultat attendu:
	 * 
	 * Ceci
	 * 
	 * Bonjour Hello est tous world un le simple monde test
	 */

	public static void main(String[] args) {

		String first = "Ceci est un simple test";
		// first.split("");

		System.out.println(Arrays.toString(first.split(" ")));

		System.out.println("");
		String[] firstarr = first.split(" ");

		for (int i = 0; i < firstarr.length; i++) {
			System.out.println(firstarr[i]);

		}

		String[][] matrix = new String[6][10];
		System.out.println("");

		for (int row = 0; row < matrix.length; row++) {

			for (int i = 0; i < firstarr.length; i++) {
				matrix[row][0] = firstarr[i];
			}
			// System.out.print(matrix[row][0] + " ");
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.println(matrix[row][column] + " ");
			}
			System.out.println();
		}

	}

}
