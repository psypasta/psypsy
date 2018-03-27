package blandat;

public class FizzBuzz {

	public static void main(String[] args) {


		String fizz = "fizz";
		String buzz = "buzz";
		String fizzBuzz = "fizzbuzz";


		for(int i = 1; i < 100; i++) {
			
		if( (i % 3 == 0 ) && (i % 5 != 0) ) {
			
			System.out.println(fizz);
			
		}
		else if( (i % 3 != 0) && (i % 5 == 0) ) {
			
			System.out.println(buzz);
			
		}
		else if( (i % 3 == 0) && (i % 5 == 0) ) {
			
			System.out.println(fizzBuzz);
			
		}
		
		
		else if( (i % 3 != 0) && (i % 5 != 0) ) {
			
			System.out.println(i);
		}
		
		}
	
	}

}
