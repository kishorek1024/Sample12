package packone;

public class MethodOver {
	
	public static void openSheet(String sname){
		System.out.println("Sheet " + sname + " Opened");
	}
	public static void openSheet(int snumber){
		System.out.println("Sheet " + snumber + " Opened");
	}
	
	public static void main(String[] args) {
		
		openSheet("abcd");
		openSheet("xyz");
		openSheet("klmn");
		
		openSheet(77);
		openSheet(57);
		openSheet("Sheet1");
		
		
		
	}

}
