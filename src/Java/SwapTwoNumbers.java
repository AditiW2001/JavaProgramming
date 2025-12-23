package Java;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a ,b, c;
		a = 10;
		b = 20;
		/*
//using third variable		
		c = a;  // 10
		a = b; //20
		b = c ; //10
		System.out.println("value of a is:" +a);
		System.out.println("value of b is:" +b);*/
		
//using (+ and -)
		/*
		a = a+b;  //10+20=30
		b = a-b;  //30-20=10
		a = a-b;  //30-10=20
		System.out.println("value of a is:" +a);
		System.out.println("value of b is:" +b);
		*/
		
//using (* and /)
		/*a = a*b;  //10*20= 200
		b = a/b;  //200/20=10
		a = a/b;  //200/10= 20
		System.out.println("value of a is:" +a);
		System.out.println("value of b is:" +b);
		*/
		
//using short hand operator (+=, -=)
		/*a+=10;  //20
		b-=10;  //10
		System.out.println("value of a is:" +a);
		System.out.println("value of b is:" +b);*/
		
		
//using short hand operator (*=, /=)
				/*a*=2;  //20
				b/=2;  //10
				System.out.println("value of a is:" +a);
				System.out.println("value of b is:" +b);*/

//using single expression
        b = a+b-(a=b);  // b = 30 -(20) = 10
        System.out.println("value of a is:" +a);
		System.out.println("value of b is:" +b); 
				
	}

}
