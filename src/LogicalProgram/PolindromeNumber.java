package LogicalProgram;

import java.util.Scanner;

public class PolindromeNumber {

	public static void main(String[] args) {
		
		//Example --> 1441 - 1441;
		//1221 - 1221
		
		int Number, sum, rem;
		
		System.out.println("Enter No");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		 Number = num;
		 for (sum=0; num>0; num=num/10) {
			 
			 rem = num%10;
			 sum = sum*10+rem;
			 }
		if(sum==Number) {
			System.out.println("Is polindrome No");
		}else {
			System.out.println("Not polindrome No");
		}	
	}
	
}
