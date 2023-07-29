package Demo;

public class Variables {
	
	int a = 10;
	
	 public void Demo() {
		 
		 int a = 20; 
		
		 System.out.println(a);
		 System.out.println(this.a);
	 }
	 
	public static void main(String[] args) {
		
		 Variables D1 = new  Variables();	
			D1.Demo();
	} 
	 
}

