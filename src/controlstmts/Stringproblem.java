package controlstmts;

public class Stringproblem {

	public static void main(String[] args) {
		//i/p java is platform indipendent language and check this contains
		//i/p Jmeter is a perfomence testing tool--Split
		
		String s="java is platform indipendent language";
		String s2="Jmeter is a performance testing tool";
		
		if(s.contains("platform"))// check if it contains "platform"
		{
			System.out.println(s.contains("platform"));
			
		}
		else {
			System.out.println("not an indipendant language");
			
		}
		
		//----Split--//
		
				String[] str=s.split(" ");
				for(String v:str)
					System.out.println(v);

	}

}
