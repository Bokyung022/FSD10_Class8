package June16th;

import java.util.Scanner;

public class MyProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

		int i, value;
		int count = 0;
		int[] ar1 = new int[10], ar2 = new int[10];

		for (i = 0; i < ar1.length; i++) {
			ar1[i] = i * 5;
		}

		// super important
		for (i = 0; i < ar1.length; i++) {
			ar2[i] = ar1[i];
		}
		System.out.println("Here are my values in array 1: ");

		for (i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + "  ");
		}
		System.out.println();

		System.out.println("Here are my values in array 2: ");
		for (i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + "  ");
		}
		System.out.println();

		ar2[3] = 900;
		ar2[5] = 720;
		ar2[7] = 1000;

		System.out.println("Please enter the value you are searching");
		value = kb.nextInt();

		for (i = 0; i < ar1.length; i++) {
			if (ar1[i] == value) {
				System.out.println("Value is found in index: " + i);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Value is not found");
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
		System.out.println("This worked");

	}

}