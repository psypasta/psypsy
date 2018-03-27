package blandat;
import java.util.Random;

public class SortInt {
	

	 public static void bubbleSort(int[] numbers, boolean reverse) {

		int n = numbers.length;
		int temp = 0;

		if(reverse) {
			for(int i = 0; i < n; i++) {
				for(int j = 1; j < (n-i); j++) {
					if(numbers[j-1] > numbers[j]) {
						temp = numbers[j-1];
						numbers[j-1] = numbers[j];
						numbers[j] = temp;		
					}
				}
			}
		}

		else {
			for(int i = 0; i < n; i++) {
				for(int j = 1; j < (n-i); j++) {
					if(numbers[j-1] < numbers[j]) {
						temp = numbers[j-1];
						numbers[j-1] = numbers[j];
						numbers[j] = temp;
					}
					
				}
			
		
			}
		}
	}
/*
 * Koden k�rs
 * Ger v�rden till randomNumber
 * loopa igenom randomNumbers l�ngd
 * ger random nummer ett tal mellan 0-100
 * anv�nder bubbleSort p� randomNumber och ger den en boolean p� viklet h�ll jag vill sortera
 */
	public static void main(String[] args) {
		Random numberGiven = new Random();
		int[] randomNumber = new int[10];


		for(int i = 0; i < randomNumber.length; i++) {
			randomNumber[i] = numberGiven.nextInt(100);
		}
		
			System.out.println("Array before Bubble Sort");
			for(int i = 0; i < randomNumber.length; i++) {
				System.out.println(randomNumber[i] + " ");
			}
			System.out.println();
				bubbleSort(randomNumber, true);
				
				
				System.out.println("Array after Bubble sort");
				for(int i = 0; i < randomNumber.length; i++) {
					
					System.out.println(randomNumber[i] + " ");
				}
			}
			
		
		
	

		
		
		


	
}
