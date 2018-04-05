package timbu;

public class SwitchStatements {

	String name = null;
	int score = 0;
	int position = 0;

	public SwitchStatements(int score, String name) {
		position = calculateHighScorePosition(score);
		displayHighScorePosition(name, position);
	}

	public static void main(String[] args) {
		new SwitchStatements(1500, "Robin");
		new SwitchStatements(900, "Alex");
		new SwitchStatements(400, "Max");
		new SwitchStatements(50, "Tobias");
	}

	public void displayHighScorePosition(String name, int position) {
		System.out.println("Managed to get into position: " + position + " " + "Name of player: " + name);

	}

	public int calculateHighScorePosition(int playerScore) {

		System.out.println("Your playerscore: " + playerScore);

		if(playerScore >= 1000) {
			System.out.println("Position 1");
			return 1;
		}
		else if(playerScore > 500 && playerScore < 1000) {
			System.out.println("Position 2");
			return 2;
		}
		else if(playerScore > 100 && playerScore < 500) {
			System.out.println("Position 3");
			return 3;
		}
		else {
			System.out.println("Position 4 or less");
			return 4;
		}
		
	}
	
	
	
}
