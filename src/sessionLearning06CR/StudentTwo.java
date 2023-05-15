package sessionLearning06CR;

import java.util.ArrayList;
import java.util.List;

public class StudentTwo {
	// instance variables
	private String name;
	private int id;
	private List<University> universities = new ArrayList<University>();

	// constructor
	public StudentTwo(String name, int id) {
        this.name = name;
        this.id = id;
    }

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<University> getUniversities() {
		return universities;
	}

	public void addUniversity(University university) {
		universities.add(university);
		university.addStudent(this);
	}
}
