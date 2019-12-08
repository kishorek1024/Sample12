package packone;

public class Abcd {
	
	Abcd(){
		System.out.println("This is Constructor");
	}
	
	void m1(){
		System.out.println("This is Method1");
	}
	
	public static void main(String[] args) {
		
		Abcd a=new Abcd();
		a.m1();
		
	}

}
