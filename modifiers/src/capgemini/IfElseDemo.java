package capgemini;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your value");
		int value = sc.nextInt();

		if (value == 1) {

			System.out.println("Today is Monday");

		} else if (value == 2) {

			System.out.println("Today is Tuesday");

		} else if (value == 3) {

			System.out.println("Today is Wednesday");

		}
		else if (value == 4) {

			System.out.println("Today is Thursday");

		}

		else if (value == 5) {

			System.out.println("Today is Friday");

		}

		else if (value == 6) {

			System.out.println("Today is Saturday");

		}

		else if (value == 7) {

			System.out.println("Today is Sunday");

		}

		else {
			
			System.out.println("Invalid value ");
			
		}
		
		
		
		
		

	}

}
