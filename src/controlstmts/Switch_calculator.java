package controlstmts;

public class Switch_calculator {

	public static void main(String[] args) {
		// Calculator
		int num=3,num1=6;
		int no=5;
		
		switch(no) {
		
		case 1:System.out.println("Adition=" + (num+num1));
		break;
		case 2:System.out.println("multiplication= "+(num*num1));
		break;
		case 3:System.out.println(num-num1);
		break;
		case 4:System.out.println(num/num1);
		break;
		default:System.out.println("not valid");
		
		
		
		}

	}

}
