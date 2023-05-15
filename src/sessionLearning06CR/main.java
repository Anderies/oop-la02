package sessionLearning06CR;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class main {

	public static void main(String[] args) {
//		callAssoc();
		callAggre();
	}
	
//	Association
	
	public static void callAssoc() {
        // create University objects
        University stanford = new University("Stanford");
        University mit = new University("MIT");

        // create Student objects
        StudentTwo alice = new StudentTwo("Alice", 123);
        StudentTwo bob = new StudentTwo("Bob", 456);

        // add students to universities
        stanford.addStudent(alice);
        mit.addStudent(bob);

        // add universities to students
        alice.addUniversity(stanford);
        bob.addUniversity(mit);

        // display student information
        System.out.println(alice.getName() + " attends:");
        for (University university : alice.getUniversities()) {
            System.out.println(university.getName());
        }

        System.out.println(bob.getName() + " attends:");
        for (University university : bob.getUniversities()) {
            System.out.println(university.getName());
        }
	}

	public static void callAggre() {
		// Creating object of Student class inside main()
        Student s1 = new Student("Mia", 1, "CSE");
        Student s2 = new Student("Priya", 2, "CSE");
        Student s3 = new Student("John", 1, "EE");
        Student s4 = new Student("Rahul", 2, "EE");
 
        // Creating a List of CSE Students
        List<Student> cse_students = new ArrayList<Student>();
 
        // Adding CSE students
        cse_students.add(s1);
        cse_students.add(s2);
 
        // Creating a List of EE Students
        List<Student> ee_students
            = new ArrayList<Student>();
 
        // Adding EE students
        ee_students.add(s3);
        ee_students.add(s4);
 
        // Creating objects of EE and CSE class inside
        // main()
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
 
        List<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
 
        // Lastly creating an instance of Institute
        Institute institute = new Institute("BITS", departments);
 
        // Display message for better readability
        System.out.print("Total students in institute: ");
 
        // Calling method to get total number of students
        // in institute and printing on console
        System.out.print(institute.getTotalStudentsInInstitute());
	}
}
