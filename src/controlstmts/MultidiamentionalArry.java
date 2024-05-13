package controlstmts;

import java.util.Scanner;

public class MultidiamentionalArry {

	public static void main(String[] args) {
		Scanner myobj=new Scanner(System.in);
		int ar[][]=new int [3][2];
		System.out.println("Enter numbers");
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) 
			    {
				ar[i][j]=myobj.nextInt();
				}
		
		}
		//---------simple for loop-----------------//
		
			/*	for(int i=0;i<3;i++) {
					for(int j=0;j<2;j++) {
						System.out.print(ar[i][j]+" ");
					}
              System.out.println();
	}*/
		
		// -----------FOR EACH LOOP-----------------//
		for(int v[]:ar) {
			for(int v1:v) {
				System.out.print(v1+" ");
				
			}
			System.out.println();
		}
			
		}

}
