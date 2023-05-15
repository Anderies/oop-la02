package sessionQuiz06CR;

public class main {

	/*
	 * 
In this example, we have three classes: `Address`, `Employer`, and `Person`. `Address` and `Employer` 
are standalone classes that represent an address and an employer, respectively. 
`Person` has a relationship with `Address` and `Employer`, as it contains instance variables of these classes.

The relationship between `Person` and `Address` is an aggregation, 
as a person can have one address, but an address can exist independently of a person. 
The relationship between `Person` and `Employer` is an association, as a person can have one employer, 
but an employer can also exist independently of a person.

The program creates instances of `Address`, `Employer`, and `Person`, and demonstrates the relationships between them. The `toString` method in the `Person` class displays the details of a person, including their name, age, address, and employer (if applicable).

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create Address objects
        Address address1 = new Address("123 Main St", "Anytown", "CA");
        Address address2 = new Address("456 Maple St", "Anytown", "CA");

        // create Employer objects
        Employer employer1 = new Employer("ABC Corp", "Finance");
        Employer employer2 = new Employer("XYZ Corp", "Tech");

        // create Person objects
        Person person1 = new Person("Alice", 25, address1, null);
        Person person2 = new Person("Bob", 35, address2, employer2);
        Person person3 = new Person("Charlie", 45, address1, employer1);

        // display Person objects
        System.out.println(person1);
        System.out.println();
        System.out.println(person2);
        System.out.println();
        System.out.println(person3);

	}

}
