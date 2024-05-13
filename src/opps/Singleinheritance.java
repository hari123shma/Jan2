package opps;

class parent
{
	public void job()
	{
		System.out.println("job details");
		
	}
}
class Child extends parent
{

public void childmethod()
{
	System.out.println("child details");
}


}

public class Singleinheritance
{

	public static void main(String[] args) 
	{
		Child ob=new Child();
		ob.childmethod();
		ob.job();

	}

}
