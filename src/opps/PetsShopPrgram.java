package opps;

import java.util.Scanner;

interface petshop{
	public void petsquanty();
	public void availablepets();
	//public void rate();
}
class dog implements petshop{
	static String name="Pet Shop";
	int qntyD=10;
	int qntyC=5;
	int priceD=500;
	int priceC=300;
	int q,q1;
	
	char op,op1;
	@Override
	public void petsquanty() {
		
	}
		
	@Override
	public void availablepets() {
		System.out.println("Welcome to Pets Shop");
		do {
			
		System.out.println("Available pets are \n 1.Dog \n 2.Cats");
		System.out.println("Select your choice");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch (ch)
		{
		
		case 1:
			System.out.println("Quantity"+qntyD);
			System.out.println("Price"+priceD);
			System.out.println("Do you want to order this dog yes or no");
			op=sc.next().charAt(0);
			
			if(op=='y') {
				System.out.println("how many quantity do you want?");
				 q=sc.nextInt();
				 if(qntyD>=q) {
					 
				 
				int p=q*priceD;
				System.out.println("Total Amount is"+p);
				System.out.println("Thank you for shoping");
				qntyD=qntyD-q;
			}else {
				System.out.println("not available");
				
			}
			
			
			}
			break;
			
		case 2:
			System.out.println("Quantity"+qntyC);
			System.out.println("Price"+priceC);
			System.out.println("Do you want to order this dog yes or no");
			op1=sc.next().charAt(0);
			
			if(op1=='y') {
				System.out.println("how many quantity do you want?");
				 q1=sc.nextInt();
				 if(qntyC>=q1) {
					 
				 
				int p1=q1*priceC;
				System.out.println("Total Amount is"+p1);
				System.out.println("Thank you for shoping");
				qntyC=qntyC-q1;
			}else {
				System.out.println("not available");
				
			}
			
			
			}
			
			break;
		}
		System.out.println("Do you want to continue ? yes or no");
		op=sc.next().charAt(0);
		}while(op=='y'); 
		
		
		}
		
		
	}

	/*@Override
	public void rate() {
		// TODO Auto-generated method stub
		
	}*/
	

public class PetsShopPrgram {

	public static void main(String[] args) {
		dog obj=new dog();
		obj.availablepets();
		
		

	}

}
