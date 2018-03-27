package uppgiftFive;

import java.util.Scanner;

import programmering.Person;

public class Main {
	
		static int total = 0;

	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hur många studenter finns det?");
		
		total = sc.nextInt();
		
		Student[] studentArray = new Student[total];
		
		
		
		for(int i = 0; i < total; i++) {
			System.out.println("Ange studentens namn:");
			studentArray[i] = new Student(sc.next());
			System.out.println("Ange resultat för eleven: " + studentArray[i].getStudentName());
			studentArray[i].setStudentResult(sc.nextInt());
				
				
		}
		for(int i = 0; i < total; i++) {
			if(studentArray[i].getStudentResult() <= 19) {
				System.out.println("Dessa Elever fick betyg U: " + "\n" + studentArray[i].getStudentName());
			}else if(studentArray[i].getStudentResult() <= 29 && studentArray[i].getStudentResult() >= 20) {
				System.out.println("Dessa Elever fick betyg 3: " + "\n" + studentArray[i].getStudentName());
			}else if(studentArray[i].getStudentResult() <= 35 && studentArray[i].getStudentResult() >= 30) {
				System.out.println("Dessa Elever fick betyg 4: " + "\n" + studentArray[i].getStudentName());
			}
			else if(studentArray[i].getStudentResult() <= 40 && studentArray[i].getStudentResult() >= 36) {
				System.out.println("Dessa Elever fick betyg 5: " + "\n" + studentArray[i].getStudentName());
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
