package sessionLearning08;

// Class 1
// Helper class
class Helper{
//	Method with 2 integer parameters
	static int Multiply(int a, int b) {
		return a * b;
	}
	
//	Method 2
//	With the same name but with double parameters
	static double Multiply(double a, double b) {
		return a * b;
	}
}

// Method Overloading Different Parameter Same Method Name
class Heroes{
	static void attack() {
        System.out.println("This character cannot attack without a weapon!");
    }
	
	static void attack(double a, double b) {
		System.out.println(a + b);
	}
}

public class example1 {

	public static void main(String[] args) {
		int aman = 10;
		
	
		// TODO Auto-generated method stub
		System.out.println(Helper.Multiply(2, 4));
		System.out.println(Helper.Multiply(2.2, 3.3));
//		
		Heroes.attack();
		Heroes.attack(10.1,10.2);
//		System.out.println();
	}

}
