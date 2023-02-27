package session02;

public class mathJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 10.1;
		double x2 = 10.5;
		double x3 = 10.6;
		
//		Java Math provides Round, Trigonometric, Exponent Method
		
//		1. Round Method
//		Math Ceil Rounds Number UP
		System.out.println(Math.ceil(x));
		System.out.println(Math.ceil(x2));
		System.out.println(Math.ceil(x3));
//		Math Floor
		System.out.println(Math.floor(x));
		System.out.println(Math.floor(x2));
		System.out.println(Math.floor(x3));
		
//		2. Trigonometric  Method
		System.out.println(Math.sin(x3));
		System.out.println(Math.toDegrees(x3));
		
//		3. Exponent Methods 
		System.out.println(Math.exp(x3));
		System.out.println(Math.sqrt(x3));
		System.out.println(Math.log(x3));
		
		double x4 = Math.log(x3) + Math.exp(x3);
		
	}

}
