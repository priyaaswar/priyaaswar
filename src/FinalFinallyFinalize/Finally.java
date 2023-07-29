package FinalFinallyFinalize;

public class Finally {

	public static void main(String[] args) {
	// Finally is a block in java exception handling to execute the important code

	/*
	 * Finally.Div(); }
	 * 
	 * public static void Div() { int i = 100; try { int k = 100 / 0; // Arithmatic
	 * Exeception System.out.println("try block"); } catch (ArithmeticEeception e) {
	 * 
	 * } finally { System.out.println("Execute finally block"); } }
	 * 
	 * }
	 */
	}
	public static void Test() {
		try {
			System.out.println("Try block");
		} catch (Exception e) {
			System.out.println("catch block");
		} finally {
			System.out.println("final block");
		}
	}
	
}

