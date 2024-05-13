package opps;

class Encap
{
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a,int b) {
		
		this.a=a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b,int c) {
		this.b=b;
	}
}


public class encapsulation {

	public static void main(String[] args) {
		
		Encap ob=new Encap();
		ob.setA(101,105);
		ob.setB(102,105);
		System.out.println(ob.getA());
		System.out.println(ob.getB());
		

	}
	
	

}
