package programmering;
import blandat.SortInt;
import java.lang.reflect.Array;
import java.util.Arrays;

public class UppgiftThree {



	public static void main(String[] args) {

		
		
		Person[] person = new Person[4];
		String[] fName = { "Sattar", "bertil", "Rebecca", "Aram"};
		int[] older = {35, 54, 24, 19};
		int temp = 0;
		String tempName;
		int tempAge;
		
		
		//Fr�ga E
		for(int i = 0; i < 4; i++) {
			
			temp += older[i];
	
		}
		
		//Fr�ga E
		System.out.println("Medelv�rdet: " + temp / 4);
		
//////////////////////////
		
		//Fr�ga D
		for(int i = 0; i < 4; i++) {

			person[i] = new Person(fName[i], older[i]);
	
		}
		
		//Fr�ga F
				tempAge = person[1].age;
				person[1].age = person[3].age;
				
				tempName = person[1].fName;
				person[1].fName = person[3].fName;
			
				person[3].age = tempAge;
				person[3].fName = tempName;
				
				for(int i = 0; i < 4; i++) {
					System.out.println(person[i].fName + " | " + person[i].age);
				}
		
	
			SortInt.bubbleSort(older, true);

			//Fr�ga D
		for(int i = 0; i < 4; i++) {
			
			if(older[0] >= person[i].age) {
				
				System.out.println(person[i].age + " | " +  person[i].fName + " �r yngst");
			}
			else if(older[3] <= person[i].age) {
				
				System.out.println(person[i].age + " | " + person[i].fName + "�r �ldst");
			}

		}
//////////////////////////

		//Ber�kna och skriv ut namnen p� dem som �r yngst och �ldst (Fr�ga A,B,C)


//		for(int i = 0; i < 2; i++ ) {
//				SortInt.bubbleSort(�lder, true);
//				
//				if(�lder[0] < �lder[i]) {
//					System.out.println("�ldsta personen: " + namn[�lder[0]] + �lder[0]);
//					
//					
//				}else if(�lder[3] > �lder[i]) {
//					System.out.println(�lder[3]);
//					
//				}
//				
//			}
//
//////////////////////////
//
//		for(int i = 0; i < namn.length; i++) {
//			
//			System.out.println("Namn: " + namn[i] + "\n" + "�lder: " + �lder[i]+ "\n" );
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
