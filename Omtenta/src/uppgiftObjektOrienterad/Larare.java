package uppgiftObjektOrienterad;

public class Larare extends Person{

	private int wage;
	private int hiredYear;
	
	public Larare(String firstName, String lastName, int bDay, int wage, int hiredYear) {
		
		this.fName = firstName;
		this.lName = lastName;
		this.bDay = bDay;
		this.wage = wage;
		this.hiredYear = hiredYear; 
	}
	
	public String skrivUt() {
		String temp;
		temp = "F�rnamn: " + this.fName + "\n" +
				"Efternamn: " + this.lName + "\n" +
				"F�delse�r: " + this.bDay + "\n" +
				"L�n: " + this.wage + "\n" +
				"Anst�llnings�r: " + this.hiredYear + "\n" +
				"L�rarens �lder: " + this.age() + "\n" +
				"Antal anst�llnings�r: " + hiredYear();
		return temp;
	}
	
	public int hiredYear() {
		
		return 2018 - this.hiredYear;
	}
}
