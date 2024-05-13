package opps;

class parent2
{
	public void occupation()
	{
		System.out.println("abc");
	}
}
class child2 extends parent2
{
	public void childage()
	{
		System.out.println("24");
	}
}
class child3 extends parent2
{
	public void childage2()
	{
		System.out.println("a2b2");
	}
}

public class multilevel {
	
	public static void main(String[] args) {
		child2 obj=new child2();
		obj.occupation();
		obj.childage();
		child3 ob=new child3();
		ob.occupation();
		ob.childage2();
		

	}

}
