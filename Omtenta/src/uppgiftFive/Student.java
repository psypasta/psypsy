package uppgiftFive;

public class Student {
	

	private String studentName = null;
	private int studentResult = 0;
	
	public Student(String name) {
		this.studentName = name;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public int getStudentResult() {
		return studentResult;
	}

	public void setStudentResult(int studentResult) {
		this.studentResult = studentResult;
	}
	
	
	
	
}
