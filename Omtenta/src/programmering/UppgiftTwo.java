package programmering;

import java.util.Scanner;

public class UppgiftTwo {

	
	private static int numberOne = 10;
	private static int numberTwo = 5;
	private static char tecken;
	private static int answer;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nummer ett: "+ numberOne + "\n" + "Nummer två: " + numberTwo + "\n");
		System.out.println("Ange din operator: ");
		tecken = sc.nextLine().charAt(0);
		
		System.out.println("Ditt tecken: " + tecken );
		
		
		if(tecken == '/') {
			answer = numberOne / numberTwo;
			
		}
		else if(tecken == '*') {
			answer = numberOne * numberTwo;
		}
		else if(tecken == '+') {
			answer = numberOne + numberTwo;
		}
		else if(tecken == '-') {
			answer = numberOne - numberTwo;
			
		}else {
			System.out.println("Operator fanns inte");
		}
		System.out.println(answer);
	}

}
