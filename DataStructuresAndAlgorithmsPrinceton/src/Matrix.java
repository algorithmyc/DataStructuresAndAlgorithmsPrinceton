
import java.util.Arrays;



public class Matrix {

	public static void main(String[] args) {
		
		int[][] matrix = new int[4][4];
		matrix[0][0] = 4;
		matrix[1][0] = 3;
		matrix[2][0] = 2;
		matrix[3][0] = 1;
		matrix[0][1] = 6;
		matrix[0][2] = 3;
		matrix[0][3] = 1;
		matrix[1][1] = 8;
		matrix[1][2] = 17;
		matrix[1][3] = 12;
		matrix[2][1] = 12;
		matrix[3][1] = 19;
		matrix[2][2] = 12;
		matrix[2][3] = 16;
		matrix[3][2] = 11;
		matrix[3][3] = 12;

		// matrix.getDeterminant();

		// System.out.println(Arrays.deepToString(matrix));

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(determinant(matrix));
		System.out.println();
		System.out.println(Arrays.deepToString(matrix));

	}

	public static int determinant(int[][] matrix) {
		// Your code here!

		int size = 4;
		int determinant = 0;
		int pivot = 0;		
		int[][] submatrix;

		for (int i = 0; i < matrix.length; i++) {

			if (matrix.length == 1) {

				determinant = matrix[0][0];
			}

			pivot = matrix[0][i];
			size--;
			
			for(int k = 0; k < matrix.length; k++) {
				
			}

		}
		
		

		return determinant;
	}

}
