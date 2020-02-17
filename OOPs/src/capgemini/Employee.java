package capgemini;
import java.util.Scanner;




public class Employee {
	
	private int eid;
	private String ename;
	double salary;
	
	
	
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}



	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Employee e1=new Employee(101,in.nextLine(),99.0);
		
	}
	 

}
