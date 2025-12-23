package Java;

public class ReverseANumberUsingOperator {

	public static void main(String[] args) {
        
		int num = 1234;//
		int rev = 0; //4
		int count = 0;
		
		while(num!=0) 
		{	
		 rev = rev*10 + num%10; //
		num = num/10;//123
		count ++;
		}
		System.out.println("Reverse number is:" +rev);
		System.out.println("No of digits in the number are:" +count);
	
	}

}
