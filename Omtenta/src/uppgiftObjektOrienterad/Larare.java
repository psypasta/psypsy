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
		temp = "Förnamn: " + this.fName + "\n" +
				"Efternamn: " + this.lName + "\n" +
				"Födelseår: " + this.bDay + "\n" +
				"Lön: " + this.wage + "\n" +
				"Anställningsår: " + this.hiredYear + "\n" +
				"Lärarens ålder: " + this.age() + "\n" +
				"Antal anställningsår: " + hiredYear();
		return temp;
	}
	
	public int hiredYear() {
		
		return 2018 - this.hiredYear;
	}
}
