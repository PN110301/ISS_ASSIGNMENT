package Variables;

public class LocalVar {
	public void marks() {
	int marks = 0; // marks is a local variable
	marks = marks + 10;
	System.out.println(marks);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVar marks = new LocalVar();
		marks.marks();

	}

}
