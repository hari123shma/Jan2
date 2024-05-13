package opps;


abstract class Animal12
{
	abstract public void animalmthd();
	{
		System.out.println("Animal sleep");
	}
}

class cat extends Animal12

{

	@Override
	public void animalmthd() 
	{
		System.out.println("cat");
		
	}
	
}






public class AbstractClass {

	public static void main(String[] args) {
		cat obj=new cat();
		obj.animalmthd();
		

	}

}
