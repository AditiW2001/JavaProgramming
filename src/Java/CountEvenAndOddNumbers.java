package Java;

public class CountEvenAndOddNumbers {

	public static void main(String[] args) {

		int num = 12345;//
	
		int count1 = 0;
		int count2 = 0;
		
		while(num!=0) //1234  123 12 1
		{	
		 int rem = num%10; //4 3  2 1
		
			if(rem%2==0) //true false true false
			{
				count1++; //1 2
				
			}
			else
			{
				count2++; //1
			}
			
			num = num/10; //123  1 2
			
		}
			System.out.println("Even:" +count1);
			System.out.println("Odd:" +count2);
		   

	}

}
