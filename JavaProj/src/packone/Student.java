package packone;

public class Student {
	
	int a; int b; int c;
	
	Student(int m1, int m2){
		a=m1; b=m2;
	}
	Student(int m1, int m2, int m3){
		a=m1; b=m2; c=m3;
	}
	
	
	void total(){
		System.out.println(a+b);
		
	}
	void percentage(){
		System.out.println((a+b)/2);
	}
	void total1(){
		System.out.println(a+b+c);
		
	}
	void percentage1(){
		System.out.println((a+b+c)/3);
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student(80, 100);
		s1.total();s1.percentage();
		
		Student s2=new Student(80, 60);
		s2.total();s2.percentage();
		
		Student s3=new Student(80, 60, 80);
		s3.total1();s3.percentage1();
		
	}

}
