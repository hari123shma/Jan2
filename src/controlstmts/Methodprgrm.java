package controlstmts;

public class Methodprgrm {

	public static void main(String[] args) {
		Methodprgrm ob=new Methodprgrm();
		ob.add();
		ob.sub(5,2);
		int m=ob.mull(23, 2);
		System.out.println("mull"+m);
		double d=ob.dev();
		System.out.println("dev"+d);
	}
	//-----Method without parameter and without return type
	
	public void add()
	{
		int a=20,b=30;
		int c=a+b;
		System.out.println("Add = "+c);
	}
	
	//--------Method with parameter and without return type
	
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("sub = "+c);
	}
	//------Method with parameter and with return type
	
	public int mull(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	//-----Method without parameter and with return type
	
	public double dev() 
	{
		int a=5,b=16;
		double c=a/b;
		return c;
	}
	

}
