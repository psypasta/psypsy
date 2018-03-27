package uppgiftObjektOrienterad;

public class Person {
	
	protected String fName;
	protected String lName;
	protected int bDay;
	
	public Person() {
		
	}

	public Person(String firstName, String lastName, int birth) {
		this.fName = firstName;
		this.lName = lastName;
		this.bDay = birth;
	}
	
	public int age() {
		
		
		return 2018 - this.bDay;
	}
	
	
}
