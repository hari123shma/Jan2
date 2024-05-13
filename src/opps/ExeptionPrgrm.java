package opps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExeptionPrgrm {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		FileInputStream f=new  FileInputStream("E://Book1.xlsx");
		
		
		try {
			int a=34,b=0;
			double c=a/b;
			System.out.println(c);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("hello");
		
		try {
			String s=null;
			System.out.println(s.length());
		}
         catch(Exception e)
		{
        	 System.out.println("null point exception");
        	 System.out.println(e.getMessage());
		}
	}

}
