package controlstmts;

public class Elseif {

	public static void main(String[] args) {
		
		// elseif
		
		int a=104,b=104,c=106;
		
		if(a>b || a>c) 
		{
			
			System.out.println("B is greater");
			
			
		}
		else if(b>c && b>a ) {
			System.out.println("A is greater");
		}
		
		else {
			
			System.out.println("c is greater");
		}
		
		
		

	}

}
