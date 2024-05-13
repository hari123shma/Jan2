package controlstmts;

import java.util.Scanner;

public class Stringpalitrom {

	public static void main(String[] args) {
		// read string and check if it is palitron or not
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter a string");
		String a,rev="";
		 a=myobj.nextLine();
		
		for(int i=a.length()-1;i>=0;i--)
		{
		rev=rev+a.charAt(i);
			
		}
        if(a.equals(rev)) {
        	System.out.println("Palintrom");
        }else {
        	System.out.println("not palintrom");
        }
	}

}
