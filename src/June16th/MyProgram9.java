package June16th;

import java.util.Random;
import java.util.Scanner;

public class MyProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		int size, i, j;
		Random rand = new Random();
		
		System.out.println("Input number: ");
		size = kb.nextInt();
		
		int[][] arr = new int[size][size];
		
		for(i = 0; i < size; i++) {
			for(j = 0; j < size; j++ ) {
				arr[i][j] = rand.nextInt(2);
			}
		}
		
		System.out.println("Here are my array: ");
		
		for(i = 0; i < size; i++) {
			for(j = 0; j < size; j++ ) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
				
	}

}