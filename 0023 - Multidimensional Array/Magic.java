class MultiDim {
	public void matrix() {
		// declaration and creation of Array
		int[][] twoDim = new int[3][3];
		// initializing array using for loop
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				twoDim[row][col] = row + col + 10;

		// use of array
		for (int row = 0; row <= 2; row++)
			for (int col = 0; col <= 2; col++)
				System.out.println(twoDim[row][col]);
	}

	public void mulArray() {
		int[][] myArray = new int[4][];
		myArray[0] = new int[2];
		myArray[1] = new int[4];
		myArray[2] = new int[6];
		myArray[3] = new int[8];
	}
}

public class Magic {
	public static void main(String[] args) {
		int[][] rat = new int[3][];
		rat[0] = new int[2];
		rat[1] = new int[5];
		rat[2] = new int[3];

		for (int row = 0; row <= 2; row++) {
			switch (row) {
			case 0:
				for (int j = 0; j <= 1; j++)
					rat[row][j] = 5 + j;
				break;
			case 1:
				for (int j = 0; j <= 4; j++)
					rat[row][j] = 50 + j;
				break;
			case 2:
				for (int j = 0; j <= 2; j++)
					rat[row][j] = 100 + j;
			}
		}

		for (int row = 0; row <= 2; row++) {
			switch (row) {
			case 0:
				for (int j = 0; j <= 1; j++)
					System.out.print(rat[row][j] + "\t");
				System.out.print("\n");
				break;
			case 1:
				for (int j = 0; j <= 4; j++)
					System.out.print(rat[row][j] + "\t");
				System.out.print("\n");
				break;
			case 2:
				for (int j = 0; j <= 2; j++)
					System.out.print(rat[row][j] + "\t");
				System.out.print("\n");

			}
		}
	}
}
