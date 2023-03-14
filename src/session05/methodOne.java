package session05;

public class methodOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i = 5.0;
		double j = 2.0;
		double k = max(i, j);

		int i2 = 5;
		int j2 = 2;
		System.out.println(max(i2, j2));

		System.out.println("The maximum of " + i + " and " + j + " is " + k);
	}

//	Method 1 name Max that has two parameter
	public static int max(int num1, int num2) {
		int result;
		System.out.println("From Method A");
		if (num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}

		return result;
	}


//	Method Overloading is a method that has same name but has different input parameter.
//	Method 2 name Max that has two parameter
	public static double max(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}

}
