package LogicalProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		//153 - 1^3=1, 5^3=125, 3^3=27 ---> 153(sum of 1+125+27) Armstrong no
      
		int P, Sum,Rem;
		
		System.out.println("Enter No");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		 P = num;
		for (Sum = 0; num>0; num = num/10) {
			Rem = num %10;
			
			Sum = Sum + Rem * Rem * Rem;	
		}
		if(Sum == P) {
			System.out.println("Armstrong No");
		}else {
			System.out.println("Not Armstrong No");
		}	
	}

}
