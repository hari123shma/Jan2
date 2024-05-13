package controlstmts;
import java.util.Scanner;
public class ScannerADD {

	public static void main(String[] args) {
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter  two number");
		
		//System.out.println("Enter a Second number");
		int a=myobj.nextInt();
		int b=myobj.nextInt();
		System.out.println("Sum of two numbers : "+(a+b));
		

	}

}
