package packone;

import com.thoughtworks.selenium.DefaultSelenium;

public class Veena {

	public static void main(String[] args) {
		
		DefaultSelenium s=new DefaultSelenium("localhost", 4444, "*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe", "http://");
		s.start();
		s.open("http://facebook.com");
		s.windowMaximize();
		
		String a=s.getTitle();
		if(a.length()==20)
			System.out.println("Pass");
		else
			System.out.println("Fail");

		String[] b=s.getAllLinks();
		System.out.println(b.length);
		
		String [] c=s.getAllButtons();
		System.out.println(c.length);
		
		
		/*s.type("id=email", "Kishore");
		boolean a=s.isElementPresent("id=pass");
		if(a==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		boolean b=s.isEditable("id=pass");
		if(b==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");*/
		
		
			
		
		/*s.type("id=email", "Kishore");
		s.type("id=pass", "abcdefgh");
		
		s.select("id=day", "24");
		s.select("id=month", "Apr");*/
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
