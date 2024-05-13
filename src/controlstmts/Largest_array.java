package controlstmts;

import java.util.Scanner;

public class Largest_array {

	public static void main(String[] args) {
		Scanner myobj=new Scanner(System.in);
		
		System.out.println("Enter size");
		System.out.println("Enter numbers");
		int size=myobj.nextInt();
		int ar[]=new int[size];
		int largest=ar[0];
		for(int i=0;i<size;i++) {
			ar[i]=myobj.nextInt();
			}
		
		int larg=ar[0];
		for(int i=1;i<size;i++) {
			
			if(ar[i]>larg){
				larg=ar[i];
			}
				}
		
		System.out.println("The largest value in the array is: "+larg);
		

	}

}
