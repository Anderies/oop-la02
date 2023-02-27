package session02;

public class wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Primitive Data Type 
		int x = 10;
		char y = 'A';
		
		
//		primitive data type cannot using method
//		System.out.println(x.toString); // error
		
		// Wrapper Object
		Integer x1 = 100;
		System.out.println(x1.toString().length());
		
		
//		x1.SIZE
//		Step 1 : Declare Wrapper
		Integer a1 = 10;
		double c2 = 6.0;
		Double c1 = 5.99;
		Character d1 = 'A';
		Boolean e1 = true;
		
//		Step 2 : Convert to Wrapper using ValueOf
		Double myIntNumber = Double.valueOf(y);
		Integer myIntNumber2 = Integer.valueOf(x);
		System.out.println("myIntNumber Digit : " + myIntNumber.toString().length());	
		System.out.println("myIntNumber2 Digit : " + myIntNumber2.toString().length());	
		
//		Step 3 : Constructor 
		Integer number = new Integer(x);
		System.out.println("Constructor : " + number.toString().length());
		System.out.println("Constructor : " + number.SIZE);
		
//		Step 4 : Casting (It's More Popular)
		Integer number2 = (Integer) x;
		System.out.println("Increment : " + ++number);
				
		
	
		
	}

}
