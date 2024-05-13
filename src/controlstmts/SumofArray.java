package controlstmts;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter numbers");
		int[]ar=new int [5];
		int i,sum=0;
		for(i=0;i<5;i++){
		ar[i]=myobj.nextInt();
		sum=sum+ar[i];
		
		
		
		}
		System.out.println(sum);

	}

}
