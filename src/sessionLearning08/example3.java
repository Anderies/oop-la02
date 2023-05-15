package sessionLearning08;

class Bank {
	float getRateOfInterest() {
		return 0;
	}
}

class BBRI extends Bank {
	float getRateOfInterest() {
		return 8.4f;
	}
}

class BMRI extends Bank {
	float getRateOfInterest() {
		return 7.3f;
	}
}

class BCA extends Bank {
	float getRateOfInterest() {
		return 9.7f;
	}
}

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b = new BBRI();
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
		
		b = new BMRI();
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
		
		b = new BCA();
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
	}

}
