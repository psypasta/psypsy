package blandat;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	
	static void bubbleSort(String[] fName) {
		
		String[] n = fName;
		String temp;
		
		for(int i = 0; i < n.length; i++) {
			for(int j = 1; j < (n.length-i); j++) {
				if(n[j-1].charAt(0) > n[j].charAt(0)) {
					
					temp = n[j-1];
					n[j-1] = n[j];
					n[j] = temp;
							
				}
				
			}
		
	
		}
	}
	
	public static void main(String[] args) {
		
		String[] fName = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < fName.length; i++) {
			fName[i] = sc.nextLine().toUpperCase();
			
		}
		
		System.out.println("FÖRE: \n");
		for(int i = 0; i < fName.length; i++) {
			
			System.out.println(fName[i]);
		}
		
		//SORTERA 8 NAMN MED A-Z
		bubbleSort(fName);
		System.out.println("EFTER: \n");
		for(int i = 0; i < fName.length; i++) {

			System.out.println(fName[i]);
		}
		
		
		
		
		
	}
	
}
