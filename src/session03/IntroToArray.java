package session03;

public class IntroToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Step 1: One way to declare array
//		double[] myListOne = { 1.9, 2.9, 3.4, 4.5 };
//		String myListTwo[] = { "Pacul", "Axe", "Siram" };
//		
////		Step 2: Second way to declare array
//		double[] myListThree = new double[4];
//		myListThree[0] = 1.9;
//		myListThree[1] = 2.9;
//		myListThree[2] = 3.4;
//		myListThree[3] = 4.5;
//		
//	
//		
////		2. Access and Process Array
//		System.out.println("access location :" + myListTwo);
//		System.out.println("Checking Length of Array : " + myListTwo.length);
//		System.out.println("You get an : " + myListTwo[0]);
//		
////		2.1 Access All the array elements
//		System.out.println("Here the list of myListTwo : ");
//		for (int i=0; i<myListTwo.length; i++) {
//			System.out.println("Index " + i + " : " + myListTwo[i]);
//		}
////		Using Foreach
//		for (String e:myListTwo) {
//			System.out.println(e);
//		}
//		
////		2.2 Sum all of the array value
//		double sumOne = 0;
//		for (int i = 0;i<myListOne.length; i++) {
//			sumOne += myListOne[i];
//		}
//		
//		System.out.println(sumOne);
//		
//		double sum = 0;
//		for (double value:myListOne) {
//			sum += value;
//		}
//		System.out.println(sum);
//		
////		2.3 Finding the largest array element
//		double max = myListOne[0];
//		for(int i=1;i<myListOne.length;i++) {
//			if(myListOne[i] > max) {
//				max = myListOne[i];
//			}
//		}
		
//		System.out.println(max);
		
//		3. Array Duplication
//		Inccorect Way
		String[] arrayOne = {"Pacul", "Axe" , "Fishing Rope"};
		String[] arrayTwo = new String[arrayOne.length];
//		arrayTwo = arrayOne;

//		System.out.println("Array Two Location : " + arrayTwo + " Array One Location :" + arrayOne);
//		System.out.println("Array Two Location : " + arrayTwo[0] + " Array One Location :" + arrayOne[0]);
		
//		Correct Way to Duplicate Array
//		Step 1 Looping
		for (int i=0; i<arrayOne.length;i++) {
			arrayTwo[i] = arrayOne[i];
		} 
		System.out.println("Array Two Location : " + arrayTwo + " Array One Location :" + arrayOne);
		System.out.println("Array Two Value : " + arrayTwo[0] + " Array One Value :" + arrayOne[0]);
		
//		Step 2 Array Copy
		System.arraycopy(arrayOne, 0, arrayTwo, 0, arrayOne.length);
		System.out.println("Array Two Location : " + arrayTwo + " Array One Location :" + arrayOne);
		System.out.println("Array Two Value : " + arrayTwo[0] + " Array One Value :" + arrayOne[0]);
		
//		Step 3 Array Clone
		String[] arrayThree = (String[]) arrayOne.clone();
		System.out.println("Array Three Location : " + arrayThree + " Array Three One :" + arrayOne);
		System.out.println("Array Three Value : " + arrayThree[0] + " Array One Value :" + arrayOne[0]);
	
	}

}
