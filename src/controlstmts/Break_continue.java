package controlstmts;

public class Break_continue {

	public static void main(String[] args) {
		// Breake and continue
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
			//	break; --print upto 4
				continue; //--print without 5
			}
			System.out.println(i);
		}

	}

}
