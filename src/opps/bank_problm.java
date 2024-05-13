package opps;
import java.util.Scanner;
interface Bank
{
	public void accountdetails(String name);
	public void balance();
	public void withdrwal();
	public void deposit();
	
	
	
}
class customer implements Bank
{
   static String bankname="SBI";
   int accountno;
   int balance=10000;
   Scanner myobj=new Scanner(System.in);
	@Override
	public void accountdetails (String name) 
	{
		System.out.println("Enter your account number");
		accountno=myobj.nextInt();
		System.out.println("Bank name = "+bankname);
		System.out.println("Accountno = "+accountno);
		System.out.println("Name="+name);
		
		
	}

	@Override
	public void balance() {
		
		System.out.println("balance"+balance);
		
	}

	@Override
	public void withdrwal() 
	{
		System.out.println("Enter withdrwal amount");
		int w=myobj.nextInt();
		if(balance>w) {
			balance=balance-w;
		
			System.out.println("balance"+balance);
		}
		else
		{
			System.out.println("insufficiant balance");
		}
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter deposit amount");
		int d=myobj.nextInt();
		balance=balance+d;
		
	}
	
}

public class bank_problm
{

	public static void main(String[] args) {
		  Scanner myobj=new Scanner(System.in);
	
			
			 
			
		 customer obj=new customer();
		 
		 obj.accountdetails("HARISHMA");
		 obj.deposit();
		 obj.balance();
		 obj.withdrwal();
		 
		
		 
		 
		
		 
		
	}
		

}
