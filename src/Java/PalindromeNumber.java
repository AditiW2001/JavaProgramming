package Java;

public class PalindromeNumber {

	public static void main(String[] args) {
		int orginal_num = 12121;
		int num = 12121;//
		int rev = 0; //4
		while(num!=0) 
		{	
		 rev = rev*10 + num%10; //
		num = num/10;//123
		}
		System.out.println("Reverse String is:" +rev);
		if(orginal_num==rev)
		{
		System.out.println("Palindrome:" +rev);
		}
		else
		{
		System.out.println("Not a Palindrome:" +rev);
		}
	
	}
}
