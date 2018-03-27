package programmering;

import java.util.Scanner;

public class UppgiftOne {
	
	
	public static int getNameTime = 0;
	
	public static void main(String[] args) {
		
		String name;
		int nameTime;
		boolean nameTimeReached = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vad heter du? \n");
		name = sc.nextLine();
		
		System.out.println("Hur många gånger ska ditt namn skrivas ut? \n");
		nameTime = sc.nextInt();
		
		
		while(nameTimeReached) {
			
			if(getNameTime < nameTime) {
				System.out.println(name);
				getNameTime++;
			}else {
				System.out.println("Break");
				nameTimeReached = false;
			}
			
		}
		
	}

}
