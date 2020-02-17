package capgemini;

public class Arrays2D {

	public static void main(String[] args) {


		String empList[][] = new String[3][];
		
		empList[0] = new String[2];
		empList[1]  = new String[3];
		empList[2]  = new String[6];
		
		
		
		empList[0][0] = "king";
		empList[0][1]= "ravi";
		empList[1][1]="anusha";
		empList[2][1] = "nitin";
		
		
		for (String[] strings : empList) {
			
			for (String names : strings) {
				
				System.out.println(names);
				
			}
			
		}
		
		
		
		
		
		
		
		System.out.println(empList[1]);
	
		

	}

}
