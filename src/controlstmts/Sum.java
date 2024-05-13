package controlstmts;

public class Sum {

	public static void main(String[] args) {
		
		// sum 1 to 10 numbers and print
		
		int num=0,sum2=0;
		for(num=1;num<=10;num++) {
			sum2=num+sum2;// 0+1=1   1+2=3 
			System.out.println(num);
		}
		
		System.out.println("sum of numbers"+sum2);
		
		
	}

}
