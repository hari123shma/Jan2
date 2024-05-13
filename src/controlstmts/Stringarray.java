package controlstmts;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=myobj.nextInt();
		System.out.println("Enter names");
		String []am=new String[n];
		for(int a=0;a<4;a++) {
			am[a]=myobj.next();//if use next()-print only the word eg:this is not read
		}
        System.out.println("Enterd nmaes are : ");
        for (String v:am) {
        	System.out.println(v);
        }
	}

}
