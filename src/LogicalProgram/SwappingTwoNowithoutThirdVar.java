package LogicalProgram;

public class SwappingTwoNowithoutThirdVar {

	public static void main(String[] args) {
		
	int	a=20, b=40; //a=40 b=20
		
		System.out.println("Befour swapping value--"+a+" "+b);
		
		a=a+b;   //a=20+40=60
		b=a-b;    //60-40 =20
		a=a-b;    //60-20 =40
		
		System.out.println("After swapping value---"+a+" "+b);
		
	}
	
}
