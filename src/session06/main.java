package session06;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Mia",1,"CS");
		Student s2 = new Student("Priya",2,"cs");
		Student s3 = new Student("Priya",3,"gat");
		Student s4 = new Student("Priya",4,"gat");
		Student s5 = new Student("Priya",5,"gat");
	
		List<Student> cs_students = new ArrayList<Student>();
		cs_students.add(s1);
		cs_students.add(s2);
		
		System.out.println(cs_students);
		
		List<Student> gat_students = new ArrayList<Student>();
		gat_students.add(s3);
		gat_students.add(s4);
		gat_students.add(s5);
		
		Departement CS = new Departement("CS", cs_students);
		Departement GAT = new Departement("GAT", gat_students);
		
		List<Departement> departements = new ArrayList<Departement>();
		departements.add(CS);
		departements.add(GAT);
		
		Institute institute = new Institute("SUNIB", departements);
		
		System.out.println("Total students in institute: "+ 
		institute.getTotalStudentInInstitute());
	}

}
