package pkg;

public class Operators {

	public static void main(String[] args) {
		
		
	// --------Arithematical operaters---------
		
		int a=20,b=30;
		System.out.println("a+b = "+(a+b));
		System.out.println("a-b = "+(a-b));
		System.out.println("a*b = "+(a*b));
		System.out.println("a/b = "+(a/b));// data type is int so float values not taken(quotient)
		System.out.println("a%b = "+(a%b));//
		
	//	-------Assignment operaters------

		int a1=35,b1=10;
		
		System.out.println("Assignment operater = a1+=b1 = "+(a1+=b1));		//a=a+b
		System.out.println("a1-=b1 = "+(a1-=b1));
		System.out.println("a1=b1 "+(a1=b1));
		
	//--------Relational Operaters--------
		
		int v1=10,v2=20;
		System.out.println("Relational operater "+(v1>v2));
		System.out.println("Relational operater "+(v1==v2));
		
	//-------Logical operaters--------
		
		//       	A      B     A&&B         A||B     !A        !B
			        
		// 	        0      0       0           0        1         1
		//	        1      0       0           1        0         1
		//	        0      1       0           1        1         0
		//	        1      1       1           1        0         0
		
		String username="abc";
		String passwd="abc123";
		
		System.out.println(username == "abc" && passwd=="abc123");
		System.out.println(username!="abc" || passwd=="acb123");
		System.out.println(!(username=="abc"));
		
		
	//-------unary operaters-------
		
		// ++ incremented by 1
		// post increment
		// preincrement
		// decrimented by 1
		
		
		int c1=4;
		System.out.println(c1++);
		System.out.println(c1);
		System.out.println(++c1);
		System.out.println(c1--);
		System.out.println(c1);
	
		
		
	//------ Ternary Operator (? :)---------
		
		  //veriable =condition?exp1:exp2;
		
		String c=v1>v2?"v1 is greater":"v2 is greater";
			System.out.println(c);
		
		
		        
		
	}

}
