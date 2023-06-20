package Loops;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		//outer loop for number of rows
		for (int i=0;i<=n;i++) {
//			for(int j=n-i;j>1;j--) {
//				System.out.println(" ");
//			}
			//inner loop for number of columns
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();		}

	}

}
