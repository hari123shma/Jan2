package controlstmts;
import java.util.Scanner;
public class Array_singlediamention {

	public static void main(String[] args) {
		// Array Sing l]dimention
		
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter numbers");
		int []ar=new int [4];
		for(int i=0;i<4;i++) {
			ar[i]=myobj.nextInt();
			
		}
		System.out.println("Entered numbers is :");
		for(int i=0;i<4;i++) {
			System.out.println(ar[i]);
		}

	}

}
