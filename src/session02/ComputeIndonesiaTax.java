package session02;

import java.util.Scanner;

public class ComputeIndonesiaTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input Penghasilan Perbulan
		System.out.println("Berapa Penghasilan Anda 1 Bulan ? ");
		Scanner myObjSalary = new Scanner(System.in);
		
		double salary = myObjSalary.nextDouble();
		
		double salaryYear;
		
		salaryYear = salary * 12;
		System.out.println(salaryYear);
	

//		Salary akan dikurangkan dengan PTKP
		salaryYear = salaryYear - 54000000;

//		Pilih Status Anda ?
		System.out.println("1. Single");
		System.out.println("2. Single Memiliki Anak");
		System.out.println("3. Married Pajak Pisah");
		System.out.println("4. Married Pajak Gabung");

		System.out.print("Masukkan Pilihan Anda = ");
		Scanner myObjStatus = new Scanner(System.in);
		int isStatus = myObjStatus.nextInt();
	
		if (isStatus == 1) {
			System.out.println("Pajak Anda : " + tabelPajak(salaryYear));
		} else if (isStatus == 2) {
			salaryYear = salaryYear - HitungAnak(salaryYear);
			System.out.println(salaryYear);
			System.out.println("Pajak Anda : " + tabelPajak(salaryYear));
		} else if (isStatus == 3) {
			salaryYear = salaryYear - 4500000;
			salaryYear = salaryYear - HitungAnak(salaryYear);
			System.out.println("Pajak Anda : " + tabelPajak(salaryYear));
		} else if (isStatus == 4) {
			salaryYear = salaryYear - 54000000;
			salaryYear = salaryYear - HitungAnak(salaryYear);
			System.out.println("Pajak Anda : " + tabelPajak(salaryYear));
		}

	}

	public static double tabelPajak(double salaryYear) {
		double tax = 0;
		if (salaryYear <= 50000000) {
			System.out.println("Kena Tier 1");
			tax = salaryYear * 0.05;
			if(tax <= 0 ) {
				tax = 0;
			}
		} else if (salaryYear <= 250000000 && salaryYear >= 50000000) {			
			System.out.println("Kena Tier 2");
			tax = (salaryYear - 2) * 0.15;
		} else if (salaryYear >= 250000000 && salaryYear <= 50000000) {
			System.out.println("Kena Tier 3");
			tax = (salaryYear - 250000000) * 0.25;
		} else if (salaryYear > 500000000) {
			System.out.println("Kena Tier 4");
			tax = (salaryYear - 500000000) * 0.3;
		}
		
		return tax;
	}

	public static double HitungAnak(double salaryYear) {
//		tanya berapa banyak anak ?
		System.out.println("Berapa Anak yang anda miliki? ");
		Scanner myObjAnak = new Scanner(System.in);
		
		int numAnak = myObjAnak.nextInt();
		System.out.println("Jumlah Anak " + numAnak);

		salaryYear = 4500000 * numAnak;
		return salaryYear;
	}
}
