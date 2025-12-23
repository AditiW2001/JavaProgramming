package Java;

import java.util.Scanner;

public class TakingInputFromUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num:");
		int num = sc.nextInt();                // to take integer  input
		System.out.println("Given number is:" +num);
		
		System.out.println("Enter a decimal num:");
		double num1 = sc.nextDouble();         // to take double as an input
		System.out.println("Given decimal number is:" +num1);

		
		System.out.println("Enter city name:");
		String city = sc.next();         // to take String an an input
		System.out.println("Given city name is:" +city);
	}

}
