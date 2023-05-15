package session07;

class PersonOne {
//	Attribute
	int PersonAttr = 5;
	
//	Constructor
	PersonOne() {
		System.out.println("Person Class Constructor");
	}
	
//	Method
	void message() {
		System.out.println("This Message from Person Class");
	}
}

// Child Class
class StudentOne extends PersonOne {
	int PersonAttr = 6;

	StudentOne() {
		super();
		System.out.println("Student Class Constructor: " + super.PersonAttr + "this / var : "
				+ "" + this.PersonAttr);
	}
	
	void message() {
		System.out.println("This Message from Student class");
	}
	
	void display() {
		this.message();
		message();
		super.message();
	}
}

public class TestSuperConstructorVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentOne s = new StudentOne();
		s.display();
	}

}
