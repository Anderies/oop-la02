package sessionQuiz06CR;

public class Person {
	// instance variables
	String name;
	int age;
	Address address;
	Employer employer;

	// constructor
	public Person(String name, int age, Address address, Employer employer) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.employer = employer;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	// toString method
	public String toString() {
		String result = "Person:\nName: " + name + "\nAge: " + age + "\nAddress: " + address.street + ", "
				+ address.city + ", " + address.state;

		if (employer != null) {
			result += "\nEmployer: " + employer.name + ", " + employer.industry;
		}

		return result;
	}
}
