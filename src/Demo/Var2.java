package Demo;

public class Var2 extends Variables {
  
	int a = 100;
	 static int a1 =300;
	 
	public void D2() {
		
		int a = 200;
		
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		
		Variables V = new Variables();
		
		System.out.println(V.a);
		
		Var2 D3 = new Var2();

		D3.D2();
		System.out.println(a1);
		System.out.println(D3.a);
		
	}	
}
