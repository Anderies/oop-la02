package session01;

import java.util.Scanner;

public class introToJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Declaring Variable
		int x = 10;
		double x1 = 20;
		String s1 = "Anderies";
		char letter = 'A';
		char b = '\u0041';
		boolean isActive = true;
		String s2 = "I have a good";
		String s3 = "day";
//		
//		Menjumlahkan  x1 + x
////		
		System.out.println(x + x1);
		System.out.println(++letter);
		System.out.println(++x1);
		System.out.println(b);
//		
//		System.out.println(s2 + " " + s3 + " Yeahh!!");
		
//		Scanner
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Masukkan Angka untuk dilipatkan dua : ");
			int number = sc.nextInt();

			System.out.println(number * 2);
		}

	}

}
