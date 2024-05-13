package opps;

interface car
{
	public void accelaration();
	public void enginespeed();
	
}
interface carworkshop
{
	public void workshopdetails();
}
class maruti implements car,carworkshop
{

	@Override
	public void accelaration()
	{
		System.out.println("Accelaration");
		
	}

	@Override
	public void enginespeed()
	{
		System.out.println("Emgine speed");
		
	}

	@Override
	public void workshopdetails()
	{
		System.out.println("Workshopdetails");
		
	}
	
}
class kia implements car,carworkshop
{

	@Override
	public void workshopdetails()
	{
	System.out.println("workshop");
		
	}

	@Override
	public void accelaration() 
	{
		System.out.println("acces");
		
	}

	@Override
	public void enginespeed() 
	{
		System.out.println("engine");
		
	}
	
}




public class InterfacePrgm
{

	public static void main(String[] args) 
	{
		car obj=new maruti();
          obj.accelaration();
          obj.enginespeed();
          //obj.workshopdetails();        // we didn't get wokshopdetails in 
          obj=new kia();
          obj.accelaration();
          obj.enginespeed();
          
          carworkshop ob=new maruti();   // to get second interface
          ob.workshopdetails();
          ob=new kia();
          ob.workshopdetails();
	}

}
