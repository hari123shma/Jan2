package opps;


	
	class Father
	{
		public void phone()
		{
			System.out.println("Samsung");
		}
	}
	
	class son extends Father
	{
		@Override
		public void phone()
		{
			
			System.out.println("I phone");
			super.phone();
			
		}
	}
	public class Methodoverriding
	{

	public static void main(String[] args) {
		son ob=new son();
		ob.phone();
		

	}

}
