package controlstmts;
import java.util.Scanner;
public class Vouwels_method {

	public static void main(String[] args)
	{
		
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=myobj.next();
		s=s.toLowerCase();
		int count=vowelCount(s);
		System.out.println("vouwelCount"+count);
		
		
		
	}

	public static int vowelCount(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
			{
				c++;
			}
			
		}
		return c;
	}
	

}
