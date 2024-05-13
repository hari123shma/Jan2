package opps;

	class member
	{
			String name;
			int age;
			long pnnumber;
			int salary;
			public void printdetails()
			{
				System.out.println("name = "+name);
				System.out.println("age = "+age);
				System.out.println("Phonenumber = "+pnnumber);
				System.out.println("salary = "+salary);

			}
	}
	
	class Emp2 extends member
	{
		
		String specilicetion;
	}
	class manager extends member
	{
		String department;
	}
	

	
	public class Methodprblms18 {

	public static void main(String[] args) {
		
		Emp2 ob=new Emp2();
		ob.name="arya";
		ob.age= 23;
		ob.pnnumber=9745768441l;
		ob.salary= 50000;
		ob.printdetails();
		
		System.out.println(ob.specilicetion="devoloping");
		manager obj=new manager();
		obj.department="Accounts";
		System.out.println(obj.department="accounts");
		
		
				
		
		

	}

}
