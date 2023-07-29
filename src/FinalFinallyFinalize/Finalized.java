package FinalFinallyFinalize;

public class Finalized {

	public static void main(String[] args) {
		
		//Finalized is method used to perform clean up processing jst befour object collected
		
		Finalized F1 = new Finalized();
		F1 = null;
		System.gc();
		
	}	
	public void demo() {
		System.out.println("demo method");
	}	
		public void finalize() {
			System.out.println("finalize method executed");
		}
	
	}
	

