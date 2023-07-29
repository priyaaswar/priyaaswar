package LogicalProgram;

public class Fibonaccisseries { 
	
public static void main(String[] args) {
	
// Fibonaccisseries--- Next number is the sum of previous two number
	// 0,1,1,2,3,5,8,13,21,34,55,......
	
	int a=-1,b=1,c;
	
	for (int i=1;i<=10;i++) {
		
		c=a+b; //c=-1+1=0
		
		System.out.println(" "+c);
		
		a=b;
		b=c;
		
	}
	
}
	
	
}
