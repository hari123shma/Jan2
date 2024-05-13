package controlstmts;

public class forloop2 {

	public static void main(String[] args) {
		
//   *  *  *  *
//   *  *  *  *
//   *  *  *  *
		   
		for(int a=1;a<=3;a++) {
			
			for(int i=1;i<=4;i++) {
				System.out.print(" * ");
			}
			System.out.println();
		    }
		
		
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
		
		for(int i=1;i<=6;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);	
			}
			System.out.println();
			
		    }
		
// 1 2 3 4 5 6 7 8 9 10
		
		int k=1;
		for(int i=1;i<=4;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(k +" ");
				k++;
			}
		    }
		
		    System.out.println();
		    
		    
        
		    
}

}
