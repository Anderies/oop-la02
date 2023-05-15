package sessionQuiz06CR;

class Employer {
	// instance variables
	String name;
	String industry;

	// constructor
	public Employer(String name, String industry) {
		this.name = name;
		this.industry = industry;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}
}
