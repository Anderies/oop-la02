package sessionLearning07;

// Super Class Person
class PersonThree {
//	Super Variable
	int PersonAttr = 5;
	
	PersonThree() {
		System.out.println("Person class Constructor");
	}
}

//subclass Student extending the Person class
class StudentTwo extends PersonThree {
	int PersonAttr = 6;
	StudentTwo() {
		// invoke or call parent class constructor
		super();
		System.out.println("Student class Constructor " + super.PersonAttr + " "+ this.PersonAttr);
	}
}


public class TestSuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentTwo s = new StudentTwo();
	}

}
