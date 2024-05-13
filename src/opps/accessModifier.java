package opps;

public class accessModifier {
	                    //----------within class     within pkg     outside pkg by sub class only      outside pkg
	
	private int a=10;   //---------    yes            no                no                               no
	protected int b=20; //---------    yes            yes               yes                              no
	int a1=5; //--------default----    yes            yes               no                               no
	int a2=6; //------public-------    yes            yes               yes                              yes
	
	public static void main(String[] args) {
		
		
		 accessModifier obj=new accessModifier();
		 System.out.println(obj.a);
		 System.out.println(obj.b);
		

	}

}
