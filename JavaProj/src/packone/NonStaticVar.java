package packone;

public class NonStaticVar {
	
	public int a=40; public int b=50;
	
	public static void main(String[] args) {
		
		NonStaticVar n=new NonStaticVar();
		System.out.println(n.a*n.b);
	}

}
