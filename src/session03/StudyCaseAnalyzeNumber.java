package session03;

import java.util.Scanner;

public class StudyCaseAnalyzeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input Number : 2 3 4 5
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of items : ");
		int n = input.nextInt();
		
		double[] numItems = new double[n];

//		2 + 3 + 4 + 5 / 4 =
		double sum = 0;
		System.out.println("Enter the value : ");
		for(int i=0;i<n;i++) {
			numItems[i] = input.nextDouble();
			sum += numItems[i];
		}
		System.out.println(sum);
		double average = sum / n;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(numItems[i]>average) {
				count++;
				System.out.println("Value of Number Average : " + numItems[i]);
			}
		}
//		You Should Print the Average Number  3.5
		System.out.println("Average is " + average);
//		And Then Print the Above Average Number  4 5
		System.out.println("Number of elements above the average is " + count);
	}

}
