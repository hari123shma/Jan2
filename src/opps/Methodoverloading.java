package opps;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add(2.3, 5);
		ob.add(5, 6);
		ob.add(6, 3);
		ob.add(9, 6, 3);
	}
	
	public void add(int a,int b) 
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(double c,int a) 
	{
		double d=c-a;
		System.out.println(d);
	}

	public void add(int a,double c)
	{
		double d=a+c;
		System.out.println(d);
	}
	public void add(int d,int f,int g)
	{
		int s=d+f+g;
		System.out.println(s);
	}
	
}
