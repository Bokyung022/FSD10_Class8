package June16th;

public class MyProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String[] arr2 = {"Bokyung", "Kim", "Sooha", "Lee"}
		char[] arr = { 'g', 'r', 'o', 'u', 'p', ' ', '7', '0' };
		
		System.out.println("Here are my array: ");

		for (char ch : arr) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		arr[3] = '0';
		for (char c : arr) {
			System.out.print(c + " ");
		}
	}

}
