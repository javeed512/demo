package capgemini;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
			int students[] = new int[5];
		
			//System.out.println(students.length);
			
				//System.out.println(students[2]);
				
			
			
			for (int i = 0; i < students.length; i++) {
				
				int value = scanner.nextInt();
				
				
				students[i] = value;
				
			}
			
			
			for (int x : students) {
				
				System.out.println(x);
			}
			
			
			
			
			
			
			
		/*
		 * 
		 * int studentList[] = new int[4];
		 * 
		 * studentList[0] = 1001;
		 * 
		 * System.out.println(studentList.length);
		 * 
		 * System.out.println(studentList[0]); System.out.println(studentList[1]);
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(studentList);
		 * 
		 */	
				
				
				
				
				

	}

}
