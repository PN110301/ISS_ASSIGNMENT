package Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a; //array declaration
		a = new int[5]; //allocate memory of 5 integers
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		// accessing elements of array
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
