package controlstmts;

import java.util.Scanner;

public class Singlediam_prblm {

	public static void main(String[] args) {
		Scanner myobj=new Scanner (System.in);
		System.out.println("Enter numbers");
	    int z=0,p=0,n=0;
		int ar[]=new int[6];
		for(int i=0;i<6;i++) {
				ar[i]=myobj.nextInt();
		}
			for(int i=0;i<6;i++) {
				if(ar[i]==0) {
					z++;
				}
				else	if(ar[i]<0) {
					p++;
				}
				else  {
					n++;
				}
			}
				System.out.println("Count of 0 = "+z);
				System.out.println("Count of positive = " +p);
				System.out.println("Count of negative = "+n);
				
			
		

}
}

	