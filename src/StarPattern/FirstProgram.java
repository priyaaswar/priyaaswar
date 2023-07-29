package StarPattern;

public class FirstProgram {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {      //row
			
			for(int j=1; j<=5; j++) {    //col
				
				if(j<=i) {
					System.out.print("*");
				}
				else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}

}
