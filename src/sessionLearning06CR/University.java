package sessionLearning06CR;

import java.util.ArrayList;
import java.util.List;

public class University {
	private String name;
    private List<StudentTwo> listStudentTwo = new ArrayList<StudentTwo>();

    // constructor
    public University(String name) {
        this.name = name;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentTwo> getStudents() {
        return listStudentTwo;
    }

    public void addStudent(StudentTwo studentTwo) {
    	listStudentTwo.add(studentTwo);
    }


}
