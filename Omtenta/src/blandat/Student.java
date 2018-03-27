package blandat;

public class Student {
	
	private double studentScore = 0;
	private String fName = null;
	private String grade = null;
	
	
	public Student(String name, double score) {
		this.fName = name;
		this.studentScore = score;
		this.grade = grade;
		
	}
	
	public double getStudentScore() {
		return this.studentScore;
	}

	public String getStudentName() {
		return this.fName;
	}
	
	public void setGrade(String g) {
		this.grade = g; 
	}
	
	public String getGrade() {
		return this.grade;
	}
	
}
