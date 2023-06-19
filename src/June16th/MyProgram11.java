package June16th;

import java.util.Scanner;

public class MyProgram11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CHECK AGAIN

		Scanner kb = new Scanner(System.in);
		int i, size, expandInt;

		System.out.println("Enter the size of array: ");
		size = kb.nextInt();
		int[] myarr = new int[size];

		for (i = 0; i < myarr.length; i++) {
			myarr[i] = i * 5;
		}

		System.out.println("=================");
		System.out.println("Printing array: ");

		for (i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i] + " ");
		}
		System.out.println();
		System.out.println("=================");
		System.out.println("Enter the expand size: ");

		expandInt = kb.nextInt();

		if (expandInt > 0) {
			myarr = expandArray(myarr, expandInt);
		}

		System.out.println("========after expanding=========");
		System.out.println("Printing array again: ");

		for (i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i] + " ");
		}
		
		kb.close();

	}

	public static int[] expandArray(int[] myar, int exp) {

		int[] expandedArray = new int[myar.length + exp];
		for (int i = 0; i < myar.length; i++) {
			expandedArray[i] = myar[i];
		}
		return expandedArray;

	}

}
