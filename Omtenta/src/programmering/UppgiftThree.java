package programmering;
import blandat.SortInt;
import java.lang.reflect.Array;
import java.util.Arrays;

public class UppgiftThree {



	public static void main(String[] args) {

		
		
		Person[] person = new Person[4];
		String[] fName = { "Sattar", "bertil", "Rebecca", "Aram"};
		int[] ålder = {35, 54, 24, 19};
		int temp = 0;
		String tempName;
		int tempAge;
		
		
		//Fråga E
		for(int i = 0; i < 4; i++) {
			
			temp += ålder[i];
	
		}
		
		//Fråga E
		System.out.println("Medelvärdet: " + temp / 4);
		
//////////////////////////
		
		//Fråga D
		for(int i = 0; i < 4; i++) {

			person[i] = new Person(fName[i], ålder[i]);
	
		}
		
		//Fråga F
				tempAge = person[1].age;
				person[1].age = person[3].age;
				
				tempName = person[1].fName;
				person[1].fName = person[3].fName;
			
				person[3].age = tempAge;
				person[3].fName = tempName;
				
				for(int i = 0; i < 4; i++) {
					System.out.println(person[i].fName + " | " + person[i].age);
				}
		
	
			SortInt.bubbleSort(ålder, true);

			//Fråga D
		for(int i = 0; i < 4; i++) {
			
			if(ålder[0] >= person[i].age) {
				
				System.out.println(person[i].age + " | " +  person[i].fName + " är yngst");
			}
			else if(ålder[3] <= person[i].age) {
				
				System.out.println(person[i].age + " | " + person[i].fName + "är äldst");
			}

		}
//////////////////////////

		//Beräkna och skriv ut namnen på dem som är yngst och äldst (Fråga A,B,C)


//		for(int i = 0; i < 2; i++ ) {
//				SortInt.bubbleSort(ålder, true);
//				
//				if(ålder[0] < ålder[i]) {
//					System.out.println("Äldsta personen: " + namn[ålder[0]] + ålder[0]);
//					
//					
//				}else if(ålder[3] > ålder[i]) {
//					System.out.println(ålder[3]);
//					
//				}
//				
//			}
//
//////////////////////////
//
//		for(int i = 0; i < namn.length; i++) {
//			
//			System.out.println("Namn: " + namn[i] + "\n" + "Ålder: " + ålder[i]+ "\n" );
//
//
//		}
//		for(int i = 0; i < namn.length; i++) {
//			removeSpace = namn[i].replaceAll("\\s", "%");
//			namn[i] = removeSpace;
//			System.out.println(namn[i]);
//
//		}
//		
	}
}
