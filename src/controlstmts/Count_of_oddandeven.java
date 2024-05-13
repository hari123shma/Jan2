package controlstmts;

public class Count_of_oddandeven {

	public static void main(String[] args) {
		// Count of odd numbers and even numbers upto 100
		
		int evencount=0,oddcount=0;
		
		for (int i=1;i<=100;i++){
			
			if(i%2==0)
			{
				evencount++;
			}
			else {
				oddcount++;
			}
		
		}
		
      System.out.println("evencount ="+evencount);
      System.out.println("oddcount = "+oddcount);
	}
}


