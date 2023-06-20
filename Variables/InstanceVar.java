package Variables;

public class InstanceVar {
	
	public String name;// instance variable accessible to any child class
	
	public InstanceVar(String EmpName) {
		name = EmpName;
	}
	
	public void printEmp() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVar emp = new InstanceVar("Shyam");
		emp.printEmp();

	}

}
