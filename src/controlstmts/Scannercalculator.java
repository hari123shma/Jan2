package controlstmts;
import java.util.Scanner;
public class Scannercalculator {

	public static void main(String[] args) {
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=myobj.nextInt();
		int b=myobj.nextInt();
		System.out.println("Enter your choice 1.add 2.sub ");
				int ch=myobj.nextInt();
		
		switch(ch) {
		
		case 1:System.out.println("Adition");
		System.out.println(a+b);
		break;
		case 2:System.out.println(a-b);
		break;
		

	}

	}
}