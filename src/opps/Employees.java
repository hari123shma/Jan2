package opps;

public class Employees {
	String empname;
	int empid;
	
	
	public Employees (String empname,int empid) {//constructor create
		this.empname=empname;
		this.empid=empid;
	}
	
	
	

	public static void main(String[] args) {
		accessModifier ob=new accessModifier();
		
		Employees emp1=new Employees("abc",101);
		System.out.println(emp1.empid);
		System.out.println(emp1.empname);

	}

}
