package June16th;

import java.util.Random;
import java.util.Scanner;

public class MyProgam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, rsize, csize, val1, val2;
		Random rand = new Random();
		Scanner kb = new Scanner(System.in);

		System.out.println("Give me the size of row and col: ");
		rsize = kb.nextInt();
		csize = kb.nextInt();

		int[][] myarray = new int[rsize][csize];
		int counter;

		for (i = 0; i < rsize; i++) {
			for (j = 0; j < csize; j++) {
				myarray[i][j] = rand.nextInt(100);
			}
		}

		System.out.println("================================");
		System.out.println("Printing the array ");

		for (i = 0; i < rsize; i++) {
			for (j = 0; j < csize; j++) {
				System.out.printf("%4d", myarray[i][j]);
			}
			System.out.println();
		}

		System.out.println("================================");
		System.out.println("Enter 2 numbers to search and replace");

		val1 = kb.nextInt();
		val2 = kb.nextInt();

		counter = arrayModifier(myarray, val1, val2);

		if (counter > 0) {
			System.out.println("================================");
			System.out.println("Changed made : ");

			System.out.println("================================");
			for (i = 0; i < rsize; i++) {
				for (j = 0; j < csize; j++) {
					System.out.printf("%4d", myarray[i][j]);
				}
				System.out.println();
			}

		}else {
			System.out.println("Nothing found: ");
		}
		
		kb.close();

	}

	public static int arrayModifier(int[][] arr, int fn, int sn) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == fn) {
					arr[i][j] = sn;
					System.out.println("The replacement happened in the index : [" + i + "] and [" + j + "]");
					counter++;
				}
			}
		}
		return counter;
	}

}
