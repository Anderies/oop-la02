package session05;

public class Dog {

	String name;
	String breed;
	int age;
	String color;

	// Constructor Declaration of Class
	public Dog(String breed, int age) {
		this.breed = breed;
		this.age = age;
	}
	public Dog(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	// method 1
	public String getName() {
		return name;
	}

	// method 2
	public String getBreed() {
		return breed;
	}

	// method 3
	public int getAge() {
		return age;
	}

	// method 4
	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return ("Hi my name is " + this.getName() + ".\nMy breed is + " + this.getBreed() + " age  " + ","
				+ this.getAge() + ",color are " + this.getColor());
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Instance Variables
		 Dog tuffy
         = new Dog("tuffy", "papillon", 5, "white");
		 
//		 Dog babo = new Dog("papillon", 10.0);
		 
		 System.out.println(tuffy.toString());
	  
	    
	}

}
