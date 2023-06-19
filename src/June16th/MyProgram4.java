package June16th;

import java.util.Scanner;

public class MyProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		int size1, size2, i;
		System.out.println("Please give me 2 sizes for ar1 and ar2: ");
		size1 = kb.nextInt();
		size2 = kb.nextInt();

		int[] ar1 = new int[size1];
		int[] ar2 = new int[size2];

		for (i = 0; i < ar1.length; i++) {
			ar1[i] = i * 5;
		}

		// condition
		if (ar1.length == ar2.length) {
			for (i = 0; i < ar1.length; i++) {
				ar2[i] = ar1[i];
			}
		} else if (ar1.length > ar2.length) {
			System.out.println("Here the length of ar2 is smaller");
			for (i = 0; i < ar2.length; i++) {
				ar2[i] = ar1[i];
			}
		} else {
			System.out.println("Here the length of ar1 is smaller");
			for (i = 0; i < ar1.length; i++) {
				ar2[i] = ar1[i];
			}

		}
		System.out.println("++++++++++++++++++++++");
		System.out.println("Here are my values in array 1: ");

		for (i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + "  ");
		}
		System.out.println();

		System.out.println("Here are my values in array 2: ");
		for (i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + "  ");
		}

	}
}