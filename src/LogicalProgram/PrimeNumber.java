package LogicalProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
	//Prime no - is greter than 1 and divided by 1 or itself only ex-2,3,5,7,11,13	
		
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		
		  int num = sc.nextInt();
		int i;
		for(i=2; i<num; i++) 
			if(num%i==0)
			break;
			
			if(i==num) 
				
				System.out.println("Prime No.");
				else
					System.out.println("Not Prime No");
			
		}
		
	}


