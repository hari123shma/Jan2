package controlstmts;

public class Nested_if {

	public static void main(String[] args) {
		
		// age<18 and weight <50
		
	//	nested if
		
		
		int age=19,weight=50;
		
		if(age>=18) 
		
          if(weight>50) {
        	  System.out.println("Eligible");
        	  
          }
        	  
          else {
        	  System.out.println("not eligible: under weight");
          }
		
		else {
			System.out.println("not");
		}
	}

}
