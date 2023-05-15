package session02;

import java.util.Scanner;

public class ComputeBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter your height in centimeters: ");
        double height = input.nextDouble();
        
        height /= 100;
        
        double bmi = weight / (height * height);
        String category;
        
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal weight";
        } else if (bmi < 30) {
            category = "Overweight";
        } else if (bmi < 35) {
            category = "Obese Class I";
        } else if (bmi < 40) {
            category = "Obese Class II";
        } else {
            category = "Obese Class III";
        }
        
        System.out.printf("Your BMI is %.2f%n", bmi);
        System.out.printf("This puts you in the %s category%n", category);

	}

}
