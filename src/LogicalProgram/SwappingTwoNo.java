package LogicalProgram;

public class SwappingTwoNo {

	public static void main(String[] args) {

		int a = 20, b = 30; // expt a=30 ,b=20

		System.out.println("Befour swapping values -- " + a + " " + b);

		int c = a; // 20
		a = b; // 30
		b = c; // 20

	    System.out.println("After swapping values--" + a + " " + b);

	}

}
