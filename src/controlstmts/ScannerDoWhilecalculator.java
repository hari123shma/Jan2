package controlstmts;
import java.util.Scanner;
public class ScannerDoWhilecalculator {

	public static void main(String[] args) {
		int ch;
		do {
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=myobj.nextInt();
		int b=myobj.nextInt();
		System.out.println("Enter your choice 1.add 2.sub 3.mul 4.dev ");
		ch=myobj.nextInt();
		
		switch(ch) {
		
		case 1:System.out.println(a+b);
		break;
		case 2:System.out.println(a-b);
		break;
		case 3:System.out.println(a*b);
		break;
		case 4:System.out.println(a/b);
		break;
		default:System.out.println("invalid choice");}
		
		}
		while (ch>0 && ch<=4) ;
		
			
		
		

	}

}
