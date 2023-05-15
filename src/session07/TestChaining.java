package session07;

// Three Class Person, Employee and Faculty

class Person {
	public int mantul = 1;
	
	public Person() {
		System.out.println("(1) Performs Person Tasks");
	}
}

class Employee extends Person {
	public int mantul = 0;
	
	public Employee(String s) {
		System.out.println(s);
	}
	
	public Employee() {
		this("(2) Invokes Employee's Overloaded Constructor");
		System.out.println("(3) Performs Employee Tasks");
	}
	
}

public class TestChaining extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestChaining();
	}
	
	public TestChaining() {
		System.out.println(super.mantul);
		System.out.println("(4) Performs TestChaining Task");
	}

}
