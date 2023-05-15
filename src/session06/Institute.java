package session06;

import java.util.List;

// Institute has a name
// Institute has a relationship to departements
public class Institute {
	String InstituteName;
	private List<Departement> departements;
	
//	Constructor of Institute
	Institute(String instituteName, List<Departement> departements){
		this.InstituteName = instituteName;
		this.departements = departements;
	}
	
	
	
	public int getTotalStudentInInstitute() {
		int noOfStudents = 0;
		List<Student> students;
		
		for(Departement dept: departements) {
			students = dept.getStudents();
			for(Student s : students) {
				noOfStudents++;
			}
		}
		
		
		return noOfStudents;
		
	}
	
	
	
}
