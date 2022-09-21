package packageFront;

public class StudentProfile {
	String firstname;
	String lastName;
	int expectedYearOfGraduation;
	int GPA;
	String declareGraduated;
	
	public StudentProfile(String firstname, String lastName, int expectedYearOfGraduation, int GPA, String declareGraduated) {
		this.firstname = firstname;
		this.lastName = lastName;
		this.expectedYearOfGraduation =expectedYearOfGraduation;
		this.GPA = GPA;
		this.declareGraduated =declareGraduated;
		
	}
	
	public int incrementalGradYear() {
		if (this.GPA <= 3) {
			
			return expectedYearOfGraduation +1;
		}
		
		else {
			return expectedYearOfGraduation;
		}
				
	}

}
