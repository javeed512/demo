package capgemini;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner  scan = new Scanner(System.in);
		
				System.out.println("Enter YOur Choice");
		
				String choice = scan.next();
				
				
				
				
				
				switch (choice) {
				case "one":
					
						System.out.println("Monday");
							
						break;

				case "two":
					
					System.out.println("Tuesday");
				break;

				case "three":
					
					System.out.println("Wednesday");
				break;

					
				default:
					
						System.out.println("Invalid value");
					break;
				}
				
				
				
				
		
		
		

	}

}
