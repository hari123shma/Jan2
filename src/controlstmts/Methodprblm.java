package controlstmts;

public class Methodprblm {

	public static void main(String[] args) {
		//area of circle , Triangle , Sqare , Rectangle
		Methodprblm ob=new Methodprblm();
		ob.circle(3.14, 5);
		ob.mull();

	}
	public void circle(double pie,double r) {
		//pie=3.14;
		//r=10;
		double c=pie*r*r;
		System.out.println("Area of cirle ="+c);
	}
	
	public void mull(){
	int a=5;
	int area=a*a;
	System.out.println("Area of Square ="+area);
}
	
}