package Java;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
//using if else 
		
		int a = 40, b= 60;
		/*
		if (a>b)
		{
			System.out.println("a is largest:" +a);
		}
		else
		{
			System.out.println("b is largest:" +b);
		}
		*/
		
//using ternary operator
		
		int res = (a>b)? a : b;
		System.out.println("largest number is :" +res);
		
		
		
		

	}

}
