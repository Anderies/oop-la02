package sessionLearning07;

class PersonTwo {
	void message() {
		System.out.println("This is person class\n");
	}
}

class Student extends PersonTwo{
	void message() {
		System.out.println("This is a student class");
	}
	
	void display() {
		this.message();
		
		super.message();
	}
}

public class TestSuperMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.display();
	}

}
