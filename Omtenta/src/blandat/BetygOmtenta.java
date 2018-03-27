package blandat;

public class BetygOmtenta {
	//Uppgift:
	/*Betyg: 100-200, 200-300, 300-400
	 * Robin:250
	 * Sandra:300
	 * Lovisa:100
	 * Anders:231
	 * Ludvig: 314
	 * 
	 * 
	 * IG = 0-199 
	 * 
	 * G =  200-300
	   VG = 300-400
	 */
	//private double[] Betyg = {210, 213, 165, 389, 400};
	//private String[] fName = {"Robin", "Sandra", "Lovisa", "Anders", "Ludvig"};
	
	public static void main(String[] args) {
		
		
		
		Student[] studentList = new Student[5];
		
		int[] studentScore = {210, 213, 165, 389, 400};
		String[] fName = {"Robin", "Sandra", "Lovisa", "Anders", "Ludvig"};
		SortInt sortInt = new SortInt();
		char test;
		for(int i = 0; i < studentList.length; i++) {
			studentList[i] = new Student(fName[i], studentScore[i]);
		}
		 
		
		SortArray sortArray = new SortArray();
		//sortArray.bubbleSort(studentList, true);
		sortInt.bubbleSort(studentScore, true);
		
		for(int i = 0; i < fName.length; i++) {
			
			
			if(studentList[i].getStudentScore() < 199 ) {
				studentList[i].setGrade("ig");
			}
			else if(studentList[i].getStudentScore() >= 200 && studentScore[i] <= 300) {
				studentList[i].setGrade("g");
			}
			else if(studentList[i].getStudentScore() >= 301){
				studentList[i].setGrade("vg");
			}	
		}

		for(int i = 0; i < studentList.length; i++) {
			//for(int j = 0; j < (studentList.length - i) ; j++) {
				
			
			//System.out.println(studentList[i].getStudentName());
			//System.out.println(studentList[i].getGrade());
			
			if('v' == studentList[i].getGrade().charAt(0)) {
				System.out.println(studentList[i].getGrade());
				System.out.println(studentList[i].getStudentName());
				
			}
			else if('i' == studentList[i].getGrade().charAt(0)) {
				System.out.println(studentList[i].getGrade());
				System.out.println(studentList[i].getStudentName());
			}
			else if('g' == studentList[i].getGrade().charAt(0)) {
				System.out.println(studentList[i].getGrade());
				System.out.println(studentList[i].getStudentName());
			}
			}
		//}
		
		}
		
	}


