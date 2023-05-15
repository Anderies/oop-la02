package sessionLearning08;

class Parent{
	void Print() {
		System.out.println("Parent Class");
	}
}

class subclass1 extends Parent{
	void Print() {
		System.out.println("Subclass 1");
	}
}

class subclass2 extends Parent{
	void Print() {
		System.out.println("Subclass 2");
	}
}

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent a;
		a = new subclass1();
		a.Print();
		
		a = new subclass2();
		a.Print();
	}

}
