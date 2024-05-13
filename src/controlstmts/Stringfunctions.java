package controlstmts;

public class Stringfunctions {

	public static void main(String[] args) {
		
		//-----concat()------//
		
		String s="hello welcome to luminar";
		String s1="Welcome";
		String s2="   Hello   ";
		System.out.println(s.concat(s1));//hello welcome to luminar
		System.out.println(2+3+s+3+6);//5hello welcome to luminar36
		
		//----equals-----//
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		
		//-----contains--//
		System.out.println(s.contains("luminar"));
		
		
		//------tolowercase--and touppercase---//
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//----starts with and ends with---///
		
		System.out.println(s.startsWith("hellow"));
		System.out.println(s.endsWith("luminar"));
		
		//---trim---//
	
		System.out.println(s2.trim());
		
		//---charAt----
		
		System.out.println(s.charAt(3));
		
		//---length()---//
		
		System.out.println(s1.length());
		
		//substring()---//
		
		System.out.println(s1.substring(1,4));
		
		//------replace---//
		
		System.out.println(s.replace("hello","hai"));
		
		//----Split--//
		
		String[] str=s.split(" ");
		for(String v:str)
			System.out.println(v);
		
		//-----tocharArray()----
		
		char[] ch=s1.toCharArray();
		for(char c:ch) {
			System.out.println(c);
			
		}
		
		
		
		
		
	}

}
