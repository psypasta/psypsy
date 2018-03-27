package blandat;

public class Test {
	
	public static void main(String[] args) {
		
	
		
		for(int i = 1; i < 100; i++) {
			
			String output = "";
			
		if( i % 3 == 0 ) {
			output += "fizz ";
		}
		if( i % 5 == 0) {
			output += "buzz ";
		}
		if(output == "" ) {
			output = String.valueOf(i);
			
		}
		
		System.out.println( output );
		}
	}
}
