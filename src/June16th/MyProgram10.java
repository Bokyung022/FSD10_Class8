package June16th;

public class MyProgram10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myarr = {7,3,2,4,7,6,3,5,7,8};
		
		int[] clonarray = myarr.clone();
		
		for(int i = 0; i < clonarray.length; i++) {
			System.out.print(clonarray[i] + " ");
		}
		
		myarr[3] = 900;
		myarr[5] = 720;
		myarr[7] = 1000;
		
		System.out.println();
		System.out.println("++++++++++++++++++");
		
		for(int i = 0; i < clonarray.length; i++) {
			System.out.print(clonarray[i] + " ");
		}
		System.out.println();
		
		
		for(int i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i] + " ");
		}
		
	}

}
