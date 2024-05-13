package controlstmts;

public class mixedquestion {

	public static void main(String[] args) {
		//String s=Testing Training Center
		//o/p =Center Training Testing
		String s="Testing Training Center";
		String[] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
		
		String s1="Hallo Wourld";
				

		System.out.println(s1.replace("Hallo","hai"));
	}

}
