package packone;

public class Methods1 {
	
	public static void method1(){
		int a=30; int b=40;
		System.out.println(a*b);
	}
	
	public void method2(){
		int a=60; int b=80;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		method1();
		
		Methods1 m=new Methods1();
		m.method2();
	}
	

}
