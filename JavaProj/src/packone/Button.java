package packone;

public class Button {
	
	int a; int b; String c;
	
	Button(int h, int w, String name){
		a=h; b=w; c=name;
	}
	
	void buttonCreate(){
		System.out.println("Button " + c + " Created Successfully");
	}
	void buttonClickable(){
		System.out.println("Button " + c + " is Clickable");
	}
	void buttonDoubleClickable(){
		System.out.println("Button " + c + " is Double Clickable");
	}
	
	public static void main(String[] args) {
		
		Button ok=new Button(80, 90, "OK");
		ok.buttonCreate();ok.buttonClickable();ok.buttonDoubleClickable();
		
		Button cancel=new Button(50, 80, "Cancel");
		cancel.buttonCreate();cancel.buttonClickable();
		
		Button help=new Button(60, 80, "Help");
		help.buttonCreate();
		
	}

}
