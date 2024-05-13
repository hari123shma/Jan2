package controlstmts;

public class Reverse {

	public static void main(String[] args) {

		int n=2768;
		int n1=2768;
		
		int rev=0,r;
		while(n>0) {    // 2768>0   276>0   27>
			r=n%10;     //2768%10=8    276%10=6    27%10=7
			rev=rev*10+r;  //0=0*8   8=8*10+6    86=86*10+7=867
			n=n/10;      //2768/10
		}
		System.out.println(rev);
		if(n1==rev) {
			System.out.println("number is palitrom");
		}
		else {
			System.out.println("not a palitrom");
		}
	}

}
