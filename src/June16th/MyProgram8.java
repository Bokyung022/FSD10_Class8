package June16th;

import java.util.Random;

public class MyProgram8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		Random rand = new Random();
		int[][] arr = new int[6][10]; // 6 rows and 10 cols

		for (i = 0; i < 6; i++) {
			for (j = 0; j < 10; j++) {
				arr[i][j] = rand.nextInt(100);
			}
		}

		System.out.println("Here are my array: ");

		for (i = 0; i < 6; i++) {
			for (j = 0; j < 10; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
