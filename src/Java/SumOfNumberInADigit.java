package Java;

public class SumOfNumberInADigit {

	public static void main(String[] args) {
		
		int num = 1234;//
		int rev = 0; // 4 //3
		int sum = 0; //4 //7
		
		
		while(num!=0) //1234 //123 //12 //1
		{	
		 rev = num%10; // 4 //3 //2 //1
		 
		 num = num/10;// 123 //12 //1 
		 
		 sum = sum +rev ; //0+4=4, 4+3=7, 7+2=9, 9+1=10
		 
	}
		System.out.println("Sum of digits in a number is:" +sum);

	}
}
